package javabasics.abstractclass;
//few methods are defined (or) implemented
//but few methods are not defined
//So, this class is a abstract class
//So, declare this class with abstract keyword
public abstract class Animal {

    abstract void eat();//abstract method (or) method declaration

    void drink(){
        System.out.println("Drinking water..");
    }
}

/*
Note: we cannot create a object for abstract classes.
 */
