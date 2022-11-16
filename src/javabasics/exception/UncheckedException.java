package javabasics.exception;

public class UncheckedException {
    static Integer convertStringToInteger(String input){
        return Integer.valueOf(input);
    }

    public static void main(String[] args) {

        //convert successfully
        String str1 = "10";
        System.out.println(convertStringToInteger(str1));

        //throws NumberFormatException
        String str2 = "nawaz";
        System.out.println(convertStringToInteger(str2));
    }
}
