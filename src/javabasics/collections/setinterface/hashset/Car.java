package javabasics.collections.setinterface.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {

    public String name;
    public String color;

//    @Override
//    public String toString() {
//        return "Name:- " + this.name + " , colour:-" + this.color;
//    }


    @Override
    public String toString() {
        return "ObjectDemo{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if(null == obj) {
            return false;
        }
        if(!(obj instanceof Car)){
            return false;
        }
        Car object = (Car) obj;
        if(this.name != object.name){
            return false;
        }
        if(this.color != object.color){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.color);
    }

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

        System.out.println(carObject1.equals(carObject2));

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
