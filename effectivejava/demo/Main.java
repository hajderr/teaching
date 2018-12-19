package effectivejava.demo;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> mittSet = new HashSet<>();
        Map<String, String> myMap = new HashMap<>();

        mittSet.add("Ett");
        mittSet.add("Två");
        mittSet.add("Ett");
        mittSet.add("Tre");
        mittSet.remove("Två");
        mittSet.add("Femtiotusen");

        NewInstrumentedHashSet<String> s = new NewInstrumentedHashSet<>(new HashSet<>());

        s.addAll(Arrays.asList("Ett", "Två", "Tre"));

        System.out.println(s.getAddCount());


    }
}
