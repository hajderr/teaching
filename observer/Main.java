package observer;

public class Main {

    public static void main(String[] args) {

        SimpleCustomer a = new SimpleCustomer("Customer A");
        SimpleCustomer b = new SimpleCustomer("Customer B");

        Hat hat = new Hat();
        hat.attach(a);
        hat.attach(b);

        hat.setNewPrice(1000);
        hat.setNewColour("blue");

    }
}
