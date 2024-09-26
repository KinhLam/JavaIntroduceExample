package Lab.OOP.Days.Ex_1_CoffeeManagement;

import java.util.ArrayList;

public abstract class Beverage {
    protected String name;
    protected double price;
    protected ArrayList<String> ingredients;

    public Beverage(){};

    public Beverage(String name, double price, ArrayList<String> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getIngredient(){
        return ingredients.toArray(new String[0]);
    }

    public void addIngredient(String ingredient){
        ingredients.add(ingredient);
    }

    public void makeBeverage(){
        System.out.println("Preparing " + name + " for $" + price);
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients=" + ingredients +
                '}';
    }

    public abstract class makeBeverage {};
}
