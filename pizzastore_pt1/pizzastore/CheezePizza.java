package pizzastore_pt1.pizzastore;

public class CheezePizza extends Pizza {

    @Override
    public void bake() {
        System.out.println("Baking a cheesy pizza");

    }

    @Override
    public void prep() {
        System.out.println("Preparing a cheeze pizza");

    }
}
