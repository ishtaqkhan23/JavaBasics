package javabasics.interfaces;

//classes should use implements keyword to provide implementation to the methods of interface.
public class HondaClassicCar implements ClassicCar {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }

    @Override
    public void engine() {
        System.out.println("Engine is starting...");
    }

    @Override
    public void openAndCloseDoors() {
        System.out.println("Opening and closing the doors...");
    }

    @Override
    public void openAndCloseWindows() {
        System.out.println("Opening and closing the windows...");
    }

    @Override
    public void fuel() {
        System.out.println("Filling fuel...");
    }

    @Override
    public void speedoMeter() {
        System.out.println("Car is running with 20kmph speed...");
    }

    @Override
    public void switchONAC() {
        System.out.println("Ac is on...");
    }
}
