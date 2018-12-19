package pizzastore_pt1.pizzastore;

public abstract class PizzaStore {


    abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prep();
        pizza.bake();
        return pizza;
    }
}
