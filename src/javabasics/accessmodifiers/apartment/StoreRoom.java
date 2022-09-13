package javabasics.accessmodifiers.apartment;

public class StoreRoom {

    //checking the kitchen access
    public static void main(String[] args) {
        Flat flat = new Flat();
        //flat.kitchen(); //No one can access kitchen from Flat.
    }
}
