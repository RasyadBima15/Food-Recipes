package com.example.foodrecipes.Model;

import android.net.Uri;

public class Recipes {

    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;
    private Uri thumnail_post;
    private int categoryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public Recipes(int id, String recipeName, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail, int categoryId) {
        this.id = id;
        this.RecipeName = recipeName;
        this.RecipeIngredients = recipeIngredients;
        this.RecipeMethodTitle = recipeMethodTitle;
        this.Recipe = recipe;
        this.Thumbnail = thumbnail;
        this.categoryId = categoryId;
    }

    public Recipes(int id, String recipeName, String recipeIngredients, String recipeMethodTitle, String recipe, Uri thumbnail_post, int categoryId) {
        this.id = id;
        this.RecipeName = recipeName;
        this.RecipeIngredients = recipeIngredients;
        this.RecipeMethodTitle = recipeMethodTitle;
        this.Recipe = recipe;
        this.thumnail_post = thumbnail_post;
        this.categoryId = categoryId;
    }

    public String getRecipeName() {
        return RecipeName;
    }

    public void setRecipeName(String recipeName) {
        RecipeName = recipeName;
    }

    public String getRecipeIngredients() {
        return RecipeIngredients;
    }

    public void setRecipeIngredients(String recipeIngredients) {
        RecipeIngredients = recipeIngredients;
    }

    public String getRecipeMethodTitle() {
        return RecipeMethodTitle;
    }

    public void setRecipeMethodTitle(String recipeMethodTitle) {
        RecipeMethodTitle = recipeMethodTitle;
    }

    public String getRecipe() {
        return Recipe;
    }

    public void setRecipe(String recipe) {
        Recipe = recipe;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public Uri getThumnail_post() {
        return thumnail_post;
    }

    public void setThumnail_post(Uri thumnail_post) {
        this.thumnail_post = thumnail_post;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

}
