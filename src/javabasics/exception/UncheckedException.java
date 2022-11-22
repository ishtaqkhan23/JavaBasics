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
        try {
            System.out.println(convertStringToInteger(str2));
        } catch (NumberFormatException exp) {
            System.out.println("Please pass only numbers. Characters are not allowed here.");
        }

        System.out.println("after numberfarmatexp");
//        //ArrayIndexOutOfBoundsException
//        int[] intArr = new int[10];
//        intArr[10] = 1;
//
//        //NullPointerException
//        String name = null;
//        name.length();
    }
}
