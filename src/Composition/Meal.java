package Composition;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private String time;
    private int calories;
    private List<MealItem> meals = new ArrayList<MealItem>();

    public void createMealItem(String mealName){
    meals.add(new MealItem(mealName));
    }
}
