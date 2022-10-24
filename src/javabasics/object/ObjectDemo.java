package javabasics.object;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ObjectDemo {

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
        if(!(obj instanceof ObjectDemo)){
            return false;
        }
        ObjectDemo object = (ObjectDemo) obj;
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

        System.out.println(carObject1.equals(carObject2));

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
