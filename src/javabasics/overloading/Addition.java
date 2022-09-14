package javabasics.overloading;

public class Addition {

    //sum of two numbers
    int sum(int a, int b) {
        return a+b;
    }

    //not acceptable
//    int sum(int b, int a) {
//        return b+a;
//    }

    //acceptable as overloading
    String sum(String a, String b) {
        return a+b;
    }

    //sum of multiple numbers
    String sum(int[] values){
        int total = 0;
        for(int i=0; i < values.length; i++){
            total = total + values[i];
        }
        return "total of array values : "+ total;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.sum(2,3));

        int[] valuess = new int[3];
        valuess[0] = 5;
        valuess[1] = 6;
        valuess[2] = 7;
        System.out.println(addition.sum(valuess));
    }
}
