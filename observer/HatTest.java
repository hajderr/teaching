package observer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HatTest {

    @Test
    public void attach() {
        Shirt shirt = new Shirt();
        shirt.setNewColour("blue");
        Assert.assertEquals("blue", shirt.getColour());


    }

    @Test
    public void setNewPrice() {
    }

    @Test
    public void setNewColour() {
    }

    @Test
    public void getObservers() {
    }
}