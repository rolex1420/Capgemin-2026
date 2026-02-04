interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }
}

class Meal<T extends MealPlan> {
    private T plan;

    public Meal(T plan) {
        this.plan = plan;
    }

    public void showMeal() {
        System.out.println(plan.getMealType());
    }
}

public class MealApp {
    static <T extends MealPlan> Meal<T> generateMeal(T plan) {
        return new Meal<>(plan);
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = generateMeal(new VegetarianMeal());
        Meal<KetoMeal> keto = generateMeal(new KetoMeal());

        veg.showMeal();
        keto.showMeal();
    }
}
