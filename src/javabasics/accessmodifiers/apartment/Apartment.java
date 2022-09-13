package javabasics.accessmodifiers.apartment;

public class Apartment {

    /*
    Note:
    default methods are accessible only within the package
    So, the below methods are only accessible to the classes under apartment package.
     */

    //this method has default access specifier
    //if no access specifier is specified. then this is treated as default access specifier
    void playGround() {
        System.out.println("Playing....");
    }

    //this method has default access specifier
    void kidsZone() {
        System.out.println("Kids are playing...");
    }

}


