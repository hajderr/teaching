package observer;

import java.util.ArrayList;
import java.util.List;

public class Hat implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private int price = 500;
    private String colour = "red";


    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void setNewPrice(int newPrice) {
        for (Observer o : observers) {
            o.update(newPrice, this.price);
        }
        this.price = newPrice;
    }

    public void setNewColour(String newColour) {
        this.colour = newColour;
        for (Observer o : observers) {
            o.update();
        }
    }

    public List<Observer> getObservers() {
        return this.observers;
    }
}
