package javabasics.abstractclass;

public class AbstractClassRunner {
    public static void main(String[] args) {
        //we cannot create object for abstract class. So, below line gives an compile time error.
        //Animal animal = new Aminal();

        //Cat cat = new Cat();

        NormalCat normalCat = new NormalCat();
        normalCat.eat();
        normalCat.chaseRats();
        normalCat.drink();

        PersianCat persianCat = new PersianCat();
        persianCat.eat();
        persianCat.chaseRats();
        persianCat.drink();


    }
}
