package javabasics.exception;

import java.io.*;

public class CheckedException {
    private static void checkedExceptionWithThrows() throws FileNotFoundException {
        File file = new File("not_existing_file.txt");
        FileInputStream stream = new FileInputStream(file);
    }

    private static void checkedExceptionWithTryCatch() {
        File file = new File("not_existing_file.txt");
        //File file = new File("C:\\Users\\91809\\Documents\\speech.txt");

        try {
            FileInputStream stream = new FileInputStream(file);
            System.out.println(stream.toString());
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist. please provide the right path.");
        }
    }

    public static void main(String[] args) {

        //checkedExceptionWithTryCatch();
        try {
            checkedExceptionWithThrows();
        } catch (FileNotFoundException exception) {
            System.out.println("File does not exist");
        }

    }
}
