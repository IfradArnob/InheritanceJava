package com.company;

public class Parent extends Pizza {
    private String name;
    private String Ingredients;

    public Parent(String name, String Ingredients) {
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

    public void printName() {
        super.printName();
        System.out.println("Newer pizza");
    }

    public String printIngredients() {
        return this.Ingredients;
    }
}