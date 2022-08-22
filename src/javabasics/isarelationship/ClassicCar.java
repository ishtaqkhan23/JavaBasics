package javabasics.isarelationship;

import javabasics.hasarelationship.Car;

//classic car is a car
//So, classcar and car is having a "is-a relationship"
public class ClassicCar extends Car {

    void switchTV(){
        System.out.println("Switching ON the TV...");
    }
    void switchONAC() {
        System.out.println("Switching on the AC.....");
    }
}
