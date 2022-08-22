package javabasics.inheritence;

public class InheritenceRunner {

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.horn();

        ClassicCar classicCar = new ClassicCar();
        classicCar.drive();
        classicCar.horn();
        classicCar.switchONAC();
        classicCar.switchTV();
        //classicCar.autoMode(); // we cannot access Luxury car methods from classic car
        //classicCar.openTopDoor(); // we cannot access Luxury car methods from classic car

        LuxuryCar luxuryCar = new LuxuryCar();
        luxuryCar.drive();
        luxuryCar.horn();
        luxuryCar.switchONAC();
        luxuryCar.switchTV();
        luxuryCar.autoMode();
        luxuryCar.openTopDoor();


        //we can assign child class object to a parent reference variable
        //but we cannot access the classcar method's from parent reference variable.
        Car car1 = new ClassicCar();
//        car1.switchONAC();
//        car1.switchTV();


    }
}
