package javabasics.loops;

import java.util.Scanner;

public class TernaryCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.next();
        String name = scanner.next();

        String greetings = gender.equals("Male") ? "Hi, Mr." + name : "Hi, Miss." + name;

        System.out.println(greetings);
    }
}
