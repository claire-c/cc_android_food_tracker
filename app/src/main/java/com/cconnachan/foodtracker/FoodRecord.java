package com.cconnachan.foodtracker;

import java.util.ArrayList;
import java.util.HashMap;

public class FoodRecord {

    private ArrayList<Food> loggedFood;
    private HashMap<MealType, Integer> loggedMeals;

    public FoodRecord(){
        this.loggedFood = new ArrayList<Food>();
        this.loggedMeals = new HashMap<>();
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

    public HashMap<MealType, Integer> getLoggedMeals(ArrayList<Food> foodToCount) {
        HashMap<MealType, Integer> loggedMeals = new HashMap<>();
        Integer breakfast = 0;
        Integer lunch = 0;
        Integer dinner = 0;
        Integer supper = 0;
        Integer snack = 0;

        for (Food food : foodToCount){
            if (food.getMealType() == MealType.BREAKFAST){
                breakfast += 1;
            } else if (food.getMealType() == MealType.LUNCH) {
                lunch += 1;
            } else if (food.getMealType() == MealType.DINNER){
                dinner += 1;
            } else if (food.getMealType() == MealType.SUPPER) {
                supper += 1;
            } else if (food.getMealType() == MealType.SNACK){
                snack += 1;
            }
        }

        loggedMeals.put(MealType.BREAKFAST, breakfast);
        loggedMeals.put(MealType.LUNCH, lunch);
        loggedMeals.put(MealType.DINNER, dinner);
        loggedMeals.put(MealType.SUPPER, supper);
        loggedMeals.put(MealType.SNACK, snack);

        this.loggedMeals = loggedMeals;
        return this.loggedMeals;
    }

//    public HashMap<MealType, Integer> getLoggedMeals() {
//        return loggedMeals;
//    }
}
