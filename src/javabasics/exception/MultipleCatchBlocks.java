package javabasics.exception;

public class MultipleCatchBlocks {

    static boolean validate(int input) {
        if (input < 0) {
            throw new IllegalArgumentException("Input is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        int i = 0; //invalid input
        String name = "khan";// invalid input
        try{
            validate(i);
            System.out.println("Length of name is " + name.length());
            //
            throwException();

//        we cannot call parent exception on top of child exceptions.
//        }  catch (Exception  e ){
//            System.out.println(e.getMessage());
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Input is not valid. Please pass correct input values.");
//        } catch (NullPointerException e) {
//            System.out.println("Cannot call length method on NULL.");
        } catch (Exception e) {
            System.out.println("There is some technical issue. please call our team on +91 8099819967 or Please try again later.");
        } finally {
            System.out.println("Program is stopped or completed");
        }
    }

    static void throwException() throws Exception {
        throw new Exception("Exception occurred.");
    }
}
