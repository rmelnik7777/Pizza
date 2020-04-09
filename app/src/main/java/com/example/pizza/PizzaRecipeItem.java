package com.example.pizza;

public class PizzaRecipeItem {

    private int ImageResource;
    private String title;
    private String description;
    private String recipe;

    public PizzaRecipeItem(int imageResource, String title, String description, String recipe) {
        this.ImageResource = imageResource;
        this.title = title;
        this.description = description;
        this.recipe = recipe;

    }

    public int getImageResource() {
        return ImageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }
}
