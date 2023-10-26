package practice.session13;

public class StringCompressor {
    public static void main(String[] args) {
        System.out.println(compress("aaabbb"));
    }

    public static String compress(String input) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            int counter = 1;
            while (index < (input.length() - 1) && input.charAt(index + 1) == input.charAt(index)) {
                counter++;
                index++;
            }
            result.append(input.charAt(index)).append(counter);
        }

        return result.toString();
    }

}
