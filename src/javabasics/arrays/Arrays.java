package javabasics.arrays;


import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // array --> storing multiple values
        //[] --> this brackets indicates array
        // new int[10] --> this is a initialization of an int array of size 10
        //size --> the no. of values can be stored
        // array index starts from 0
        int[] integerArray = new int[10];

        //assigning the values for each index of array
        integerArray[0] = 10;
        integerArray[1] = 11;
        integerArray[2] = 12;
        integerArray[3] = 13;
        integerArray[4] = 14;
        integerArray[5] = 15;
        integerArray[6] = 16;
        integerArray[7] = 17;
        integerArray[8] = 18;
        integerArray[9] = 19;

        Scanner scanner = new Scanner(System.in);
        for(int index = 0; index < integerArray.length; index++){
            integerArray[index] = scanner.nextInt();
        }

        for(int index = 0; index < integerArray.length; index++){
            System.out.println(integerArray[index]);
        }

        //when we try to access the array beyond its declared size then we will get run time exception
        //integerArray[10] = 20;

        //accessing the value of array at position 0
        System.out.println(integerArray[0]);

        //print the length of array
        System.out.println(integerArray.length);

    }
}
