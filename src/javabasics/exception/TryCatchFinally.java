package javabasics.exception;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }

        // try without catch and with finally is valid
        try {
            System.out.println("Try");
        } finally {
            System.out.println("finally");
        }


        // try without catch and finally is invalid
//        try {
//            System.out.println("Try");
//        }

        //try with only catch is valid
        try {
            System.out.println("Try");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
