package pizzastore_pt2;

public class NYCPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYCCheezePizza();
        } else if ("veggie".equals(type)) {
            return new NYCVeggiePizza();
        } else {
            throw new RuntimeException();
        }
    }


}
