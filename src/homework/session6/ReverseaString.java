package homework.session6;

public class ReverseaString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hello Andrei , I am 28 , nice");
        reverseString(str);
    }
    public static void reverseString(StringBuilder input) {
        System.out.println(input.reverse());
    }
}

