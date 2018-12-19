package builderpattern;

public class NutritionFacts {

    private int servingSize; // required
    private int servings; // (per container) required

    // optional
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;


    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);

    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories,0);

    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
    }

}
