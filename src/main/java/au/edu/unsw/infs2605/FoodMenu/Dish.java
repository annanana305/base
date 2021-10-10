/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.infs2605.FoodMenu;

/**
 *
 * @author ad
 */
public class Dish {
    private String name;
    private String ingredients;
    private double price;
    private String mode_of_delivery;

    public Dish(String name, String ingredients, double price, String mode_of_delivery) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.mode_of_delivery = mode_of_delivery;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ingredients
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the mode_of_delivery
     */
    public String getMode_of_delivery() {
        return mode_of_delivery;
    }

    /**
     * @param mode_of_delivery the mode_of_delivery to set
     */
    public void setMode_of_delivery(String mode_of_delivery) {
        this.mode_of_delivery = mode_of_delivery;
    }
    public String toString(){
        return "Dish name = " + this.getName();
    }
         
    
}
