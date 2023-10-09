package practice.session10.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());

        student.setAge(-5);
        System.out.println("Student age after set to -5: " + student.getAge());
    }
}