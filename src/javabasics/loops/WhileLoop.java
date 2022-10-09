package javabasics.loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //example: taking numOfInputs from scanner.
        Scanner scanner = new Scanner(System.in);
        int numOfInputs = scanner.nextInt();

        int enteredInputs = 1;
        while (enteredInputs <= numOfInputs){
            int input = scanner.nextInt();
            System.out.println("Your " + enteredInputs + "  input is " + input);
            enteredInputs++;
        };

//        while(true){
//            System.out.println("while loop...");
//        }

        //lets consider user is provided 5 as numOfInputs
        // then
        // in the first loop condition will be 0!=5 ==> true
        // in the second loop condition will be 1!=5 ==> true
        // in the second loop condition will be 2!=5 ==> true
        // in the third loop condition will be 3!=5 ==> true
        // in the fourth loop condition will be 4!=5 ==> true
        // in the fifth loop condition will be 5!=5 ==> false and then the while loop will be terminated
    }
}
