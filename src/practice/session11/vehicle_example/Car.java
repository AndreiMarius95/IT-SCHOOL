package practice.session11.vehicle_example;

public class Car extends Vehicle implements Refuel {

    @Override
    public void refuel() {
        // from interface
    }

    @Override
    void accelerate() {
        // from abstract class
    }

    @Override
    void brake() {
        // from abstract class
    }
}