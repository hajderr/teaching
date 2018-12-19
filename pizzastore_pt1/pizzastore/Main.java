package pizzastore_pt1.pizzastore;

// Exempel från Head First Design Patterns
public class Main {


    public static void main(String[] args) {
        PizzaStore nycStore = new NYCPizzaStore();

        Pizza pizza = nycStore.orderPizza("cheese");
        System.out.println(pizza);

        // Vad händer om vi behöver adda fler pizzor?

        // Vi kan  införa en abstraktion och det är att lägga allt i en pizza store
        // En pizza store kan instansieras med en egen factory. Se SimplePizzaFactory

        // En butik i NY preppar och bakar pizzorna på sitt sätt.
        // Medan en butik i Chicago på ett annat sätt.
        // Hur kan vi ordna detta? Titta i NYCCheesePizza och fundera hur vi kan abstrahera bort ingredienser

    }
}
