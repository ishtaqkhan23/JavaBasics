package javabasics.inheritence;

//classiccar is a type of car
//so, this is "is-a" relationship between ClassicCar and Car
//extends keyword is used to define is-a relationship
public class ClassicCar extends Car {

    void switchTV(){
        System.out.println("Switching ON the TV...");
    }
    void switchONAC() {
        System.out.println("Switching on the AC.....");
    }
}
