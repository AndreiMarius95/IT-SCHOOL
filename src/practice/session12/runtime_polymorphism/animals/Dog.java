package practice.session12.runtime_polymorphism.animals;

public class Dog extends Animal {

    @Override
    public String sound() {
        return "Dog barks.";
    }
}
