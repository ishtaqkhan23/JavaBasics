package javabasics.hasarelationship;

public class Car {

    String carName;
    String carModel;
    Steering steering;//cas has a steering. So, this is a "has-a" relationship between Car and Steering.
    Engine engine;//car has a engine. So, this is a "has-a" relationship between Car and Engine.

    void drive() {
        System.out.println("Driving...");
    }

    void horn() {
        System.out.println("Beeppp...");
    }
}
