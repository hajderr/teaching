package builderpattern;

import builderpattern.real.NutritionFactsReal;

// Example from Effective Java (Bloch)
public class Main {

    public static void main(String[] args) {


        //Ska returnera en Builder
        NutritionFactsReal nutritionFactsReal
                = new NutritionFactsReal.Builder(250, 10).build();

        NutritionFactsReal nutritionFactsReal1
                = new NutritionFactsReal.Builder(500, 100)
                .calories(20).build();

        NutritionFactsReal nutritionFactsReal2 = new NutritionFactsReal.Builder(900, 100)
                .fat(200)
                .sodium(125).build();


    }
}
