package javabasics.exception.customcheckedexception;

//if we need to create custom exception
//then we need to extends Exception class into our class
public class InvalidAgeException extends Exception {

    //parameterized constructor
    //accepting error message
    public InvalidAgeException(String message) {
        //calling super class constructor
        super(message);
    }
}
