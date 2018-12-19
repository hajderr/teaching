package pizzastore_pt1.pizzastore;

public class NYCPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NYCCheezePizza();

        } else if ("vegetarian".equals(type)) {
            pizza = new NYCVeggiePizza();
        }

        return pizza;
    }
}
