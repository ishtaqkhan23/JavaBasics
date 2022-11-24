package javabasics.exception.customuncheckedexception;

public class Vote {

    static boolean validateVoter(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid.");
        }
        return true;
    }

    public static void main(String[] args) {

        //RunTimeExceptions are optional to handle
        validateVoter(17);
        System.out.println("You are eligible to vote.");

// we can handle using below code
//        try {
//            validateVoter(17);
//        } catch (InvalidAgeException e) {
//            System.out.println(e.getMessage());
//        }

    }
}
