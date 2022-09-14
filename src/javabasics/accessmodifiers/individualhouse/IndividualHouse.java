package javabasics.accessmodifiers.individualhouse;

import javabasics.accessmodifiers.airtel.AirtelBoardBand;
import javabasics.accessmodifiers.apartment.Apartment;
import javabasics.accessmodifiers.apartment.Flat;

public class IndividualHouse {

    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        //apartment.playGround(); individual house people cannot access playground of apartment. because it is outside of apartment

        //runner method to check the access of kitchen
        Flat flat = new Flat();
        //flat.kitchen(); //No one can access kitchen from Flat.

        AirtelBoardBand airtelBoardBand = new AirtelBoardBand();
        //airtelBoardBand.getInternetConnection();

    }
}
