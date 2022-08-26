package javabasics.classexample;

import javabasics.classexample.*;

public class Runner {
    public static void main(String[] args) {

        //Mixer is a type of the object
        //fruitMixer is a variable name (or) reference variable for calling the Mixer object
        //new is a keyword that helps in creating the memory for the Mixer object
        //Mixer() is a constructor for creating Mixer object
        Mixer fruitMixer = new Mixer();//this line is creating an object for mixer

        System.out.println(fruitMixer.mixerName);//printing the mixer name by using reference variable(fruitMixer) of the Mixer object

        //set operating person by using reference variable(fruitMixer) of the Mixer object
        fruitMixer.operatingBy = "Ishtaq";
        System.out.println("Operating by:- "+ fruitMixer.operatingBy);


        //calling the method runningWithSpeed by using reference variable(fruitMixer) of the Mixer object to set the speed
        fruitMixer.runningWithSpeed(2);
        System.out.println("With Speed "+fruitMixer.speed);


        //calling the method fruitJuicer by using reference variable(fruitMixer) of the Mixer object to set the speed
        String juice = fruitMixer.fruitJuicer("Banana", 1, 1);
        System.out.println(juice);

    }
}
