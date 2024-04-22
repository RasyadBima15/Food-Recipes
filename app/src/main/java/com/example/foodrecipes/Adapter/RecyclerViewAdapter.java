package com.example.foodrecipes.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foodrecipes.Fragment.OptionDialogFragment;
import com.example.foodrecipes.R;
import com.example.foodrecipes.RecipeActivity;
import com.example.foodrecipes.Model.Recipes;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private static Context mContext;
    private final List<Recipes> mData;
    private static FragmentManager fragmentManager;

    public RecyclerViewAdapter(Context mContext, List<Recipes> mData, FragmentManager fragmentManager) {
        RecyclerViewAdapter.mContext = mContext;
        this.mData = mData;
        RecyclerViewAdapter.fragmentManager = fragmentManager;
    }

    public RecyclerViewAdapter(Context mContext, List<Recipes> mData) {
        RecyclerViewAdapter.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());
        view = mInflater.inflate(R.layout.cardview_recipe, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.recipeTitle.setText(mData.get(position).getRecipeName());
        Recipes recipe = mData.get(position);
        if (recipe.getThumnail_post() != null){
            holder.setData(recipe);
        } else {
            holder.img_recipe_thumbnail.setImageResource(mData.get(position).getThumbnail());
        }
        holder.setData(recipe);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, RecipeActivity.class);
                intent.putExtra("Name", mData.get(position).getRecipeName());
                intent.putExtra("Ingredients", mData.get(position).getRecipeIngredients());
                intent.putExtra("MethodTitle", mData.get(position).getRecipeMethodTitle());
                intent.putExtra("Recipe", mData.get(position).getRecipe());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        TextView recipeTitle;
        CardView cardView;
        ImageView img_recipe_thumbnail;
        ImageButton btnDelete;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            recipeTitle = itemView.findViewById(R.id.text_recipe);
            img_recipe_thumbnail = itemView.findViewById(R.id.recipe_img_id);
            cardView = itemView.findViewById(R.id.cardview_id);
            btnDelete = itemView.findViewById(R.id.deletebtn);
        }

        public void setData(Recipes recipe) {
            if (recipe.getThumnail_post() != null){
                Glide.with(itemView).load(recipe.getThumnail_post()).into(img_recipe_thumbnail);
            }
            btnDelete.setOnClickListener( v -> {
                OptionDialogFragment optionDialog = new OptionDialogFragment(recipe.getId(), RecyclerViewAdapter.mContext);
                optionDialog.show(fragmentManager,
                        OptionDialogFragment.class.getSimpleName());
            });
        }
    }
}
