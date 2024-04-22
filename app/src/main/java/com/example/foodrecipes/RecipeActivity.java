package com.example.foodrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView mRecipeName = findViewById(R.id.text_recipe);
        TextView mRecipeIngredients = findViewById(R.id.ingredients);
        TextView mRecipeMethodTitle = findViewById(R.id.method);
        TextView mRecipe = findViewById(R.id.recipe);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Name");
        String Ingredients = intent.getExtras().getString("Ingredients");
        String MethodTitle = intent.getExtras().getString("MethodTitle");
        String Recipe = intent.getExtras().getString("Recipe");

        mRecipeName.setText(Title);
        mRecipeIngredients.setText(Ingredients);
        mRecipeMethodTitle.setText(MethodTitle);
        mRecipe.setText(Recipe);

    }
}