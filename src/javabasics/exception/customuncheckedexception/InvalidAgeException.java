package javabasics.exception.customuncheckedexception;

//if we need to create custom exception
//then we need to extends Exception class into our class
public class InvalidAgeException extends RuntimeException {

    //parameterized constructor
    //accepting error message
    public InvalidAgeException(String message) {
        //calling super class constructor
        super(message);
    }
}
