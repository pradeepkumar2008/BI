import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    int getCalories();
    List<String> getIngredients();
}

class VegetarianMeal implements MealPlan {
    private String name;
    private int calories;
    private List<String> ingredients;

    public VegetarianMeal(String name, int calories, List<String> ingredients) {
        this.name = name;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Vegetarian Meal: " + name + " (" + calories + " calories)";
    }
}

class VeganMeal implements MealPlan {
    private String name;
    private int calories;
    private List<String> ingredients;

    public VeganMeal(String name, int calories, List<String> ingredients) {
        this.name = name;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Vegan Meal: " + name + " (" + calories + " calories)";
    }
}

class Meal<T extends MealPlan> {
    private List<T> meals;

    public Meal() {
        meals = new ArrayList<>();
    }

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public int getTotalCalories() {
        return meals.stream().mapToInt(MealPlan::getCalories).sum();
    }

    public void displayMealPlan() {
        System.out.println("Meal Plan:");
        meals.forEach(meal -> {
            System.out.println(meal);
            System.out.println("Ingredients: " + meal.getIngredients());
        });
        System.out.println("Total Calories: " + getTotalCalories());
    }
}

public class MealPlanGenerator {
    public static <T extends MealPlan> boolean validateMealPlan(Meal<T> mealPlan, int targetCalories) {
        return mealPlan.getTotalCalories() <= targetCalories;
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
        vegetarianPlan.addMeal(new VegetarianMeal("Vegetable Curry", 
            450, List.of("Rice", "Mixed Vegetables", "Curry Sauce")));
        vegetarianPlan.addMeal(new VegetarianMeal("Greek Salad", 
            300, List.of("Lettuce", "Feta", "Olives", "Tomatoes")));

        System.out.println("Vegetarian Plan:");
        vegetarianPlan.displayMealPlan();
        System.out.println("Valid for 1000 calories? " + 
            validateMealPlan(vegetarianPlan, 1000));

        Meal<VeganMeal> veganPlan = new Meal<>();
        veganPlan.addMeal(new VeganMeal("Quinoa Bowl", 
            400, List.of("Quinoa", "Chickpeas", "Avocado")));
        veganPlan.addMeal(new VeganMeal("Fruit Smoothie", 
            200, List.of("Banana", "Berries", "Almond Milk")));

        System.out.println("\nVegan Plan:");
        veganPlan.displayMealPlan();
        System.out.println("Valid for 500 calories? " + 
            validateMealPlan(veganPlan, 500));
    }
}