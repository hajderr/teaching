package observer;

public class SimpleCustomer implements Observer {
    private final String customerName;

    public SimpleCustomer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update() {
        System.out.println(this.customerName + " Wehoo nu finns min produkt inne!");
    }

    @Override
    public void update(int newState, int oldState) {
        System.out.println(this.customerName + " nu finns min produkt inne! (" + newState + ", " + oldState + ")");

    }
}
