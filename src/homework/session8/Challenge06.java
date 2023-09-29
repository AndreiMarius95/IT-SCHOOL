package homework.session8;

import java.util.LinkedList;

public class Challenge06 {
    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();
        studentList.add("Andrei");
        studentList.add("Marius");
        studentList.add("Madalina");
        studentList.add("Petronela");
        System.out.println("Before removing: " + studentList);

        removeParticularStudent("Madalina", studentList);
        System.out.println("After removal: " + studentList);
    }

    public static void removeParticularStudent(String name, LinkedList<String> studentArr) {
        if (studentArr.contains(name)) {
            studentArr.remove(name);
            System.out.println(name + " was removed");
        } else {
            System.out.println("Not here");
        }
    }
}
