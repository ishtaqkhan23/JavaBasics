package javabasics.collections.setinterface.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Car carObject1 = new Car();
        carObject1.name = "car";
        carObject1.color = "red";

        System.out.println(carObject1);
        System.out.println(carObject1.hashCode());

        Car carObject2 = new Car();
        carObject2.name = "car";
        carObject2.color = "red";

        System.out.println(carObject2);
        System.out.println(carObject2.hashCode());

        Set<Car> carHashSet = new HashSet<>();
        carHashSet.add(carObject1);
        carHashSet.add(carObject2);

        System.out.println(carHashSet);


        Set<String> stringDemoHashSet = new HashSet<>();
        stringDemoHashSet.add("Nawaz");
        stringDemoHashSet.add("Nawaz");

        System.out.println(stringDemoHashSet);
    }
}
