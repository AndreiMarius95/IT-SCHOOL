package homework.session8;

import java.util.ArrayList;
import java.util.List;

public class Challenge03 {
    public static void main(String[] args) {
        String[] studentArray = {"Andrei", "Marius", "Ionut", "Ioana", "George", "Bogdan", "Dragos", "Iustina", "Madalina", "Petronela"};
        ArrayList<String> studentList = new ArrayList<>(List.of(studentArray));
        ArrayList<String> graduateStudentList = new ArrayList<>(studentList);

        printGraduateStudents(graduateStudentList);
    }

    public static void printGraduateStudents(ArrayList<String> arr) {
        for (String student : arr) {
            System.out.println(student);
        }
    }
}

