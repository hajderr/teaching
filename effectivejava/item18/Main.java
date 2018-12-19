package effectivejava.item18;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InstrumentedHashSet<Object> objects = new InstrumentedHashSet<>();

        objects.addAll(Arrays.asList("Snap", "Crackle", "Pop"));

        System.out.println(objects.getAddCount());
    }
}
