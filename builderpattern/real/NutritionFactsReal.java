package builderpattern.real;

public class NutritionFactsReal {

    private int servingSize; // required
    private int servings; // (per container) required

    // optional
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    // Builder klass som kan användas av klienter

    public static class Builder {
        private int servingSize; // required
        private int servings; // (per container) required

        // optional, initiera dem till 0
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFactsReal build() {

            return new NutritionFactsReal(this);
        }
    }

    private NutritionFactsReal(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }



}
