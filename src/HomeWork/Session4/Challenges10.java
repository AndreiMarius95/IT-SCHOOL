package HomeWork.Session4;

import java.util.ArrayList;

public class Challenges10 {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();

        listOne.add("Steaua");
        listOne.add("Dianamo");
        listOne.add("Rapid");
        listOne.add("Farul Constanta");
        System.out.println(listOne);

        ArrayList<String> listTwo = listOne;
        System.out.println(listTwo);
    }
}

