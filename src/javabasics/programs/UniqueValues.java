package javabasics.programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueValues {
    public static void main(String[] args) {
        Set<Integer> uniqueSet = new HashSet<>();
        Scanner sc= new Scanner(System.in);
        int noOfInputs = sc.nextInt();
        for (int i = 0; i< noOfInputs; i++){
            uniqueSet.add(sc.nextInt());
        }
        System.out.println("Unique values are :"+ uniqueSet);
    }
}
