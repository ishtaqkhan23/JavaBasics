package javabasics.exception.customcheckedexception;

public class Vote {

    static boolean validateVoter(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid.");
        }
        return true;
    }

    public static void main(String[] args) {

        try {
            validateVoter(17);
            System.out.println("You are eligible to vote.");

        } catch (InvalidAgeException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
