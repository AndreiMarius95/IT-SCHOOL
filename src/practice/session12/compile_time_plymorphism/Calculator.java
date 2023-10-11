package practice.session12.compile_time_plymorphism;

public class Calculator {

    //method overloading - compile-time polymorphism
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}