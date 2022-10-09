package javabasics.loops;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.next();
        String name = scanner.next();

        if (gender.equals("Male")) {
            System.out.println("Hi, Mr." + name);
        } else {
            System.out.println("Hi, Miss." + name);
        }
    }
}
