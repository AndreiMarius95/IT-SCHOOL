package practice.session9.prctice;

import java.util.ArrayList;
import java.util.List;
public class Practice {
    public static void main(String[] args) {
        String name1 = "Maria"; //created in the String Pool
        String name2 = "Maria";

        boolean comparison = name1 == name2; //true

        List<String> names1 = new ArrayList<>();
        names1.add("Ionut");
        names1.add("Marius");
        // {Ionut, Marius}
        //    0      1

        String someName = "Ionut";
        List<String> names2 = new ArrayList<>();
        names2.add(someName);

        boolean comparison2 = names1.get(0) == someName;
        boolean comparison3 = names1.get(0) == names2.get(0);
        boolean comparison4 = names2.get(0) == someName;
        System.out.println(comparison2);
    }
}

