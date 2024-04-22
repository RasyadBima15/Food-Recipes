package com.example.foodrecipes.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.foodrecipes.DataSource.Data;
import com.example.foodrecipes.MainActivity;
import com.example.foodrecipes.Model.Recipes;
import com.example.foodrecipes.R;

public class AddFoodFragment extends Fragment {

    TextView name, ingredients, method;
    ImageButton imgBtn;
    Button btn_post;
    RadioGroup category;
    RadioButton dessert, maincourse, appetizer;
    Uri imagePost;

    String nametv, ingredientstv, methodtv;
    int categoryId;

    private ActivityResultLauncher<Intent> galleryLauncher;
    Intent galleryIntent;
    Context context;

    public AddFoodFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_food, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        name = view.findViewById(R.id.foodname);
        ingredients = view.findViewById(R.id.ingredients);
        method = view.findViewById(R.id.method);
        imgBtn = view.findViewById(R.id.imageButton);
        btn_post = view.findViewById(R.id.btn_post);
        category = view.findViewById(R.id.category);
        dessert = view.findViewById(R.id.dessert);
        maincourse = view.findViewById(R.id.maincourse);
        appetizer = view.findViewById(R.id.appetizer);

        dessert.setOnClickListener(v -> {
            if (dessert.isChecked()) {
                categoryId = 1;
            }
        });
        maincourse.setOnClickListener(v -> {
            if (maincourse.isChecked()) {
                categoryId = 2;
            }
        });
        appetizer.setOnClickListener(v -> {
            if (appetizer.isChecked()) {
                categoryId = 3;
            }
        });

        imgBtn.setOnClickListener(v -> {
            galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            galleryLauncher.launch(galleryIntent);
//            galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
//            galleryIntent.setType("image/*");
//            galleryLauncher.launch(galleryIntent);
        });

        galleryLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK && result.getData() != null){
                        imagePost = result.getData().getData();
                        Glide.with(this).load(imagePost).into(imgBtn);
                    }
                });

        btn_post.setOnClickListener( v -> {
            nametv = name.getText().toString().trim();
            ingredientstv = ingredients.getText().toString().trim();
            methodtv = method.getText().toString().trim();

            Recipes recipe = new Recipes(Data.idCount, nametv, ingredientstv, "Metode", methodtv, imagePost, categoryId);
            Data.idCount += 1;
            if (nametv.isEmpty()){
                Toast.makeText(context, "Anda belum mengisi nama makanan!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (categoryId == 0) {
                Toast.makeText(context, "Anda belum mengisi category!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (ingredientstv.isEmpty()){
                Toast.makeText(context, "Anda belum mengisi ingredients!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (methodtv.isEmpty()) {
                Toast.makeText(context, "Anda belum mengisi metode!", Toast.LENGTH_SHORT).show();
                return;
            }
            if (recipe.getThumnail_post() == null){
                Toast.makeText(context, "Anda belum mengupload gambar!", Toast.LENGTH_SHORT).show();
                return;
            }
            Data.recipes1.add(0, recipe);
            Toast.makeText(context, "Post Berhasil Ditambahkan!", Toast.LENGTH_SHORT).show();
            MainActivity.title.setText("All Food");
            AllFoodsFragment allFoodsFragment = new AllFoodsFragment(context);
            FragmentManager fragmentManager = getParentFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_layout, allFoodsFragment, AllFoodsFragment.class.getSimpleName())
                    .commit();
        });
    }
}