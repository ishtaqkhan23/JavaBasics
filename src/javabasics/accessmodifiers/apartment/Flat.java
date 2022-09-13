package javabasics.accessmodifiers.apartment;

import javabasics.accessmodifiers.municipality.PublicWaterSystem;


public class Flat {

    //this method has private access modifier
    //it means only Flat class members can access this method
    private void kitchen() {
        System.out.println("Home kicken...");
    }

    public static void main(String[] args) {
        //kitchen is priviate to Falt. only people in the Flat can access kitchen
        Flat flat = new Flat();
        flat.kitchen();

        //Flat is under apartment package. So, flat can use the default methods of Apartment class.
        Apartment apartment = new Apartment();
        apartment.playGround();

        //Anyone can use public methods of PublicWaterSystem. So Flat can also use.
        PublicWaterSystem publicWaterSystem = new PublicWaterSystem();
        publicWaterSystem.waterConnection();

    }
}
