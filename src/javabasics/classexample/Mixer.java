package javabasics.classexample;

//class is a keyword
//Mixer is a class name
public class Mixer {

    //public is access modifier
    //String is datatype
    //mixerName is a variable name
    //= is assignment operator
    //PANASONIC is a value
    public String mixerName = "PANASONIC"; //we assigned a value to the variable. So, this is called as variable defination.
    public String operatingBy; // we do not assign a value to the variable. So, this is called as variable declaration.
    public int speed; // we do not assign a value to the variable. So, this is called as variable declaration.



    //void is return type. when method returns void then it means that this method does not return any value.
    //int speedNumber -- it is a input parameter
    //this method has a body. so this is a method defination
    public void runningWithSpeed(int speedNumber){
        speed = speedNumber * 10;//method body
    }

    //public is access modifier
    //String is return datatype of the fruitJuicer method
    //fruitJuicer is a method name
    //String fruitName, int sugarContent, int waterQuantity -- these are the input parameters of the fruitJuicer method
    //line no. 32, 33 & 34 is a method body
    // this method has a body. so, this is a method defination
    public String fruitJuicer(String fruitName, int sugarContent, int waterQuantity){
        String juice = fruitName + " juice!, Prepared with sugar content of " + sugarContent + " spoons and "+ waterQuantity +
                " glasses of water";
        return juice; //return statement
    }




}
