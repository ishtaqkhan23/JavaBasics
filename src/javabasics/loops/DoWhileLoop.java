package javabasics.loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        //example:- taking 5 inputs from user
        Scanner scanner = new Scanner(System.in);
        int numOfInputs = 5;
        int enteredInputs = 1;
        do {
            int input = scanner.nextInt();
            System.out.println("Your " + enteredInputs + "  input is " + input);
            enteredInputs++;
        } while (enteredInputs <= numOfInputs);


        //example : taking bus ticket
        String[] stops = new String[]{"Marathahalli", "Mutiplex", "HSRLayout", "Silkboard"};
        String myStop = "Mutiplex";
        int currentStopIndex = 0;
        String currentStop;
        do {
            currentStop = stops[currentStopIndex];
            System.out.println("Current stop is :" + currentStop);
            currentStopIndex++;
        } while (!myStop.equals(currentStop));

        System.out.println("Dropped at "+ myStop);

    }
}
