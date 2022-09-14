package javabasics.overriding;

public class NawazCar extends Car {

    @Override
    PowerSteering steering() {
        System.out.println("left steering..");
        PowerSteering powerSteering = new PowerSteering();
        return powerSteering;
    }

    public static void main(String[] args) {
        NawazCar nawazCar = new NawazCar();
        nawazCar.steering();
    }
}
