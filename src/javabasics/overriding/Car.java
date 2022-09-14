package javabasics.overriding;

public class Car {

    void fuelType(){
        System.out.println("Petrol");
    }

    Steering steering() {
        System.out.println("right steering");
        Steering steering = new Steering();
        return steering;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.steering();
    }
}
