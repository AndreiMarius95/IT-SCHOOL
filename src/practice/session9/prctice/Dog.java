package practice.session9.prctice;

public class Dog {

    private String breed;
    public int age;
    public String colour;

    public String getBark(String dogName, float decibels) {
        if (decibels > 30) {
            return dogName + "ham ham".toUpperCase() + decibels;
        }
        return dogName + "ham ham with " + decibels;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        String dogBark = dog.getBark("Azorel", 37);
    }
}
