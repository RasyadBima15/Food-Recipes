package com.example.foodrecipes.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodrecipes.Adapter.RecyclerViewAdapter;
import com.example.foodrecipes.DataSource.Data;
import com.example.foodrecipes.MainActivity;
import com.example.foodrecipes.R;

public class AllFoodsFragment extends Fragment {

    public static RecyclerViewAdapter myAdapter;
    Context context;

    public AllFoodsFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_foods, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView myrecyclerView = view.findViewById(R.id.recyclerView_id);
        FragmentManager fragmentManager = getParentFragmentManager();
        myAdapter = new RecyclerViewAdapter(context, Data.recipes1, fragmentManager);
        myrecyclerView.setLayoutManager(new GridLayoutManager(context, 1));
        myrecyclerView.setAdapter(myAdapter);
    }
}