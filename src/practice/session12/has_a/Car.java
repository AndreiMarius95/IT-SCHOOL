package practice.session12.has_a;

public class Car {

    private Engine engine; //using composition, Car HAS-A Engine

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }

    void drive() {
        System.out.println("Car is driving");
    }
}