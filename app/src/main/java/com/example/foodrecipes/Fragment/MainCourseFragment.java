package com.example.foodrecipes.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodrecipes.Adapter.RecyclerViewAdapter;
import com.example.foodrecipes.DataSource.Data;
import com.example.foodrecipes.Model.Recipes;
import com.example.foodrecipes.R;

import java.util.ArrayList;

public class MainCourseFragment extends Fragment {

    public static RecyclerViewAdapter myAdapter;
    Context context;
    int categoryId;
    ArrayList<Recipes> recipesArray = new ArrayList<>();

    public MainCourseFragment(Context context, int categoryId){
        this.context = context;
        this.categoryId = categoryId;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_course, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        for (Recipes recipes: Data.recipes1) {
            if (recipes.getCategoryId() == categoryId){
                recipesArray.add(recipes);
            }
        }
        RecyclerView myrecyclerView = view.findViewById(R.id.recyclerView_id);
        FragmentManager fragmentManager = getParentFragmentManager();
        myAdapter = new RecyclerViewAdapter(context, recipesArray, fragmentManager);
        myrecyclerView.setLayoutManager(new GridLayoutManager(context, 1));
        myrecyclerView.setAdapter(myAdapter);
    }
}