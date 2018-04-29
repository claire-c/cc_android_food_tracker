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

    public int totalLogged(){
        return loggedFood.size();
    }

    //This is reliant on passing in the same object that has been logged. Not sure if I will need to refactor this?
    public void removeFood(Food foodToRemove){
        ArrayList<Food> newLoggedFood = new ArrayList<>();
        for(Food food : loggedFood ){
            if(!food.equals(foodToRemove)){
                newLoggedFood.add(food);
            }
        }
        loggedFood = newLoggedFood;
    }


}
