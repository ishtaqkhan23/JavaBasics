package javabasics.inheritence;

//Luxury is a type of car
//so, this is "is-a"  between ClassicCar and Car
//extends keyword is used to define is-a relationship
public class LuxuryCar extends ClassicCar {

    String perfume;

    void openTopDoor() {
        System.out.println("Openening the top door... ");
    }

    void autoMode() {
        System.out.println("Starting auto mode.... ");
    }

}
