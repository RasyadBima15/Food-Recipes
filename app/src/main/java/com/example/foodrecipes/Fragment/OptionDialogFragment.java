package com.example.foodrecipes.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.foodrecipes.DataSource.Data;
import com.example.foodrecipes.MainActivity;
import com.example.foodrecipes.R;

public class OptionDialogFragment extends DialogFragment {

    private Button btnCancel, btnDelete;
    private int id;
    Context context;

    public OptionDialogFragment(int id, Context context){
        this.id = id;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_option_dialog, container, false);
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnCancel = view.findViewById(R.id.btn_cancel);
        btnDelete = view.findViewById(R.id.btn_delete);

        btnCancel.setOnClickListener( v -> {
            getDialog().cancel();
        });
        btnDelete.setOnClickListener( v -> {
            Data.recipes1.removeIf(recipe -> recipe.getId() == id);
            System.out.println(id);
            Toast.makeText(context, "Data berhasil dihapus", Toast.LENGTH_SHORT).show();
            FragmentManager fragmentManager = getParentFragmentManager();

            AllFoodsFragment allFoodsFragment = new AllFoodsFragment(context);
            DessertFragment dessertFragment = new DessertFragment(context, MainActivity.getCategoryId());
            MainCourseFragment mainCourseFragment = new MainCourseFragment(context, MainActivity.getCategoryId());
            AppetizerFragment appetizerFragment = new AppetizerFragment(context, MainActivity.getCategoryId());

            Fragment fragmentDessert = fragmentManager.findFragmentByTag(DessertFragment.class.getSimpleName());
            Fragment fragmentMainCourse = fragmentManager.findFragmentByTag(MainCourseFragment.class.getSimpleName());
            Fragment fragmentAppetizer = fragmentManager.findFragmentByTag(AppetizerFragment.class.getSimpleName());
            if (fragmentDessert instanceof DessertFragment){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, dessertFragment, DessertFragment.class.getSimpleName())
                        .commit();
            } else if (fragmentMainCourse instanceof MainCourseFragment){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, mainCourseFragment, MainCourseFragment.class.getSimpleName())
                        .commit();
            } else if (fragmentAppetizer instanceof AppetizerFragment){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, appetizerFragment, AppetizerFragment.class.getSimpleName())
                        .commit();
            } else {
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, allFoodsFragment, AllFoodsFragment.class.getSimpleName())
                        .commit();
            }
            getDialog().dismiss();
        });
    }
}