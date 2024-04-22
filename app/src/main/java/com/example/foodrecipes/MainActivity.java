package com.example.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodrecipes.Adapter.RecyclerViewAdapter;
import com.example.foodrecipes.DataSource.Data;
import com.example.foodrecipes.Fragment.AddFoodFragment;
import com.example.foodrecipes.Fragment.AllFoodsFragment;
import com.example.foodrecipes.Fragment.AppetizerFragment;
import com.example.foodrecipes.Fragment.DessertFragment;
import com.example.foodrecipes.Fragment.MainCourseFragment;
import com.example.foodrecipes.Model.Recipes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public static int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        MainActivity.categoryId = categoryId;
    }

    private static int categoryId;

    DrawerLayout drawerLayout;
    ImageView menu;
    public static TextView allfoods, addfood, dessert, maincourse, appetizer, title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title =  findViewById(R.id.title);
        drawerLayout = findViewById(R.id.drawerlayout);
        menu = findViewById(R.id.menu);
        allfoods = findViewById(R.id.all_foods);
        addfood = findViewById(R.id.addfood);
        dessert = findViewById(R.id.dessert);
        maincourse = findViewById(R.id.maincourse);
        appetizer = findViewById(R.id.appetizer);

        FragmentManager fragmentManager = getSupportFragmentManager();
        AllFoodsFragment allFoodsFragment = new AllFoodsFragment(this);
        Fragment fragmentAllFoods = fragmentManager.findFragmentByTag(AllFoodsFragment.class.getSimpleName());

        if (!(fragmentAllFoods instanceof AllFoodsFragment)){
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_layout, allFoodsFragment, AllFoodsFragment.class.getSimpleName())
                    .commit();
        }

        menu.setOnClickListener( v -> {
            openDrawer(drawerLayout);
        });

        allfoods.setOnClickListener( v -> {
            title.setText("All Foods");
            closeDrawer(drawerLayout);
            if (!(fragmentAllFoods instanceof AllFoodsFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, allFoodsFragment, AllFoodsFragment.class.getSimpleName())
                        .commit();
            }
        });

        addfood.setOnClickListener( v -> {
            title.setText("Add Food");
            closeDrawer(drawerLayout);
            AddFoodFragment addFoodFragment = new AddFoodFragment(this);
            Fragment fragmentAddFood = fragmentManager.findFragmentByTag(AddFoodFragment.class.getSimpleName());
            if (!(fragmentAddFood instanceof AddFoodFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, addFoodFragment, AddFoodFragment.class.getSimpleName())
                        .commit();
            }
        });

        dessert.setOnClickListener( v -> {
            setCategoryId(1);
            title.setText("Dessert");
            closeDrawer(drawerLayout);
            DessertFragment dessertFragment = new DessertFragment(this, getCategoryId());
            Fragment fragmentDessert = fragmentManager.findFragmentByTag(DessertFragment.class.getSimpleName());
            if (!(fragmentDessert instanceof DessertFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, dessertFragment, DessertFragment.class.getSimpleName())
                        .commit();
            }
        });

        maincourse.setOnClickListener( v -> {
            setCategoryId(2);
            title.setText("Main Course");
            closeDrawer(drawerLayout);
            MainCourseFragment mainCourseFragment = new MainCourseFragment(this, getCategoryId());
            Fragment fragmentMainCourse = fragmentManager.findFragmentByTag(MainCourseFragment.class.getSimpleName());
            if (!(fragmentMainCourse instanceof MainCourseFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, mainCourseFragment, MainCourseFragment.class.getSimpleName())
                        .commit();
            }
        });

        appetizer.setOnClickListener( v -> {
            setCategoryId(3);
            title.setText("Appetizer");
            closeDrawer(drawerLayout);
            AppetizerFragment appetizerFragment = new AppetizerFragment(this, getCategoryId());
            Fragment fragmentAppetizer = fragmentManager.findFragmentByTag(AppetizerFragment.class.getSimpleName());
            if (!(fragmentAppetizer instanceof AppetizerFragment)){
                fragmentManager.beginTransaction()
                        .replace(R.id.frame_layout, appetizerFragment, AppetizerFragment.class.getSimpleName())
                        .commit();
            }
        });
    }

    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public static void closeDrawer(DrawerLayout drawerLayout){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
//    public static void redirectActivity(Activity activity, Class secondActivity ){
//        Intent intent = new Intent(activity, secondActivity);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        activity.startActivity(intent);
//        activity.finish();
//    }

}