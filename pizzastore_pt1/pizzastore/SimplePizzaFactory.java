package pizzastore_pt1.pizzastore;

public class SimplePizzaFactory {

    Pizza createPizza(String type) {

        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheezePizza();

        } else if ("vegetarian".equals(type)) {
            pizza = new VeggiePizza();
        }

        pizza.prep();
        pizza.bake();
        return pizza;

    }
}