package javabasics.collections.setinterface.hashset;

import javabasics.object.ObjectDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        ObjectDemo carObject1 = new ObjectDemo();
        carObject1.name = "car";
        carObject1.color = "red";

        System.out.println(carObject1);
        System.out.println(carObject1.hashCode());

        ObjectDemo carObject2 = new ObjectDemo();
        carObject2.name = "car";
        carObject2.color = "red";

        System.out.println(carObject2);
        System.out.println(carObject2.hashCode());

        Set<ObjectDemo> objectDemoHashSet = new HashSet<>();
        objectDemoHashSet.add(carObject1);
        objectDemoHashSet.add(carObject2);

        System.out.println(objectDemoHashSet);


        Set<String> stringDemoHashSet = new HashSet<>();
        stringDemoHashSet.add("Nawaz");
        stringDemoHashSet.add("Nawaz");

        System.out.println(stringDemoHashSet);
    }
}
