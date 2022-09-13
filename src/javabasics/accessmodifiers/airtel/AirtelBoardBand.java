package javabasics.accessmodifiers.airtel;

public class AirtelBoardBand {


    //this method has protected access modifier
    //this method is accessible to the classes of this package(javabasics.accessmodifiers.airtel)
    //and to the classes that has a relation with this class
    protected void getInternetConnection() {
        System.out.println("Using airtel internet connection..");
    }
}
