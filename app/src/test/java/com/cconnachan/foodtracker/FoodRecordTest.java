package com.cconnachan.foodtracker;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FoodRecordTest {

    private FoodRecord recordedFood;
    private Food chips;
    private Food cucumber;

    @Before
    public void setup(){
        recordedFood = new FoodRecord();
        chips = new Food("chips", "15/03/2018", MealType.DINNER);
        cucumber = new Food("cucumber", "01/01/2018", MealType.SNACK);
    }

    @Test
    public void canGetLoggedFood(){
        assertEquals(0, recordedFood.getLoggedFood().size());
    }

    @Test
    public void canAddFood(){
        recordedFood.addFood(chips);
        assertEquals(1, recordedFood.getLoggedFood().size());
    }

    @Test
    public void canGetTotalNumberOfFoodLogs(){
        recordedFood.addFood(cucumber);
        assertEquals(1, recordedFood.totalLogged());
    }

//    @Test
//    public void canRemoveSpecifiedFood(){
//        recordedFood.addFood(chips);
//        recordedFood.addFood(cucumber);
//        recordedFood.removeFood(chips);
//        assertEquals(2, recordedFood.getLoggedFood().size());
//
//    }
}
