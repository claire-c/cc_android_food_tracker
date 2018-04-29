package com.cconnachan.foodtracker;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FoodRecordTest {

    private FoodRecord recordedFood;
    private Food chips;

    @Before
    public void setup(){
        recordedFood = new FoodRecord();
        chips = new Food("chips", "15/03/2018", MealType.DINNER);
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
}
