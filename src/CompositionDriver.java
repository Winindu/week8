import Composition.Meal;
import Composition.MealItem;

public class CompositionDriver {
    public static void main(String[] args) {
        Meal meal = new Meal();
//        MealItem meal1 = new MealItem("df");

        meal.createMealItem("Sandwich");
    }
}
