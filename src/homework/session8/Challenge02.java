package homework.session8;

import java.util.ArrayList;

public class Challenge02 {
    public static void main(String[] args) {
        ArrayList<String> wishlist = new ArrayList<>();
        wishlist.add("car");
        wishlist.add("lego");
        wishlist.add("airplane");
        printArrayList(wishlist);
    }

    public static void printArrayList(ArrayList<String> arr) {
        System.out.println(arr);
    }
}

