package com.cconnachan.foodtracker;

import java.util.ArrayList;

public class FoodRecord {

    private ArrayList<Food> loggedFood;

    public FoodRecord(){
        this.loggedFood = new ArrayList<Food>();
    }

    public ArrayList<Food> getLoggedFood() {
        return loggedFood;
    }

    public void addFood(Food foodToAdd){
        loggedFood.add(foodToAdd);
    }


}
