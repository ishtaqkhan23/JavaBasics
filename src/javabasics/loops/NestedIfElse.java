package javabasics.loops;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {

        //1. example --> Display greeting message based on age group
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        //nested if else
        if (age < 0 || age > 100) {
            System.out.println("Invalid age...");
        } else if (age < 10) {
            System.out.println("Hello Kid...");
        } else if (age < 20) {
            System.out.println("Hello Teen...");
        } else if (age < 30) {
            System.out.println("Hello Gentleman..");
        } else {
            System.out.println("Hello Old man.... ");
        }

        //nested ternary operator which is equivalent to the above nested if else condition
        String greetings = age < 0 || age > 100 ? "Invalid Age" :
                age < 10 ? "Hello kid.. " :
                        age < 20 ? "Hello Teen.." :
                                age < 30 ? "Hello Gentleman.." : "Hello old man...";
        System.out.println(greetings);



        //2. example -- Display grade based on total marks
        int marks = 65;
        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }
    }
}
