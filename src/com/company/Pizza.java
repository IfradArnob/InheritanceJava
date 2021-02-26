package com.company;

public class Pizza {
    private String name;
    private String Ingredients;

    public Pizza() {

    };

    public Pizza(String name,  String Ingredients) {
        this.name = name;
        this.Ingredients= Ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String Ingredients) {
        this.Ingredients = Ingredients;
    }

    protected void printName() {
        System.out.println("Old Pizza");
    }

    public String printIngredients() {
        return this.Ingredients;
    }
}