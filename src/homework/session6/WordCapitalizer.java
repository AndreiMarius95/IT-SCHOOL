package homework.session6;

public class WordCapitalizer {

    public static void main(String[] args) {
        System.out.println(capitalizeAllFirstLetters("Iasi is located in Romania, more precisely in Europe, more precisely on planet Earth"));
    }

    private static String capitalizeAllFirstLetters(String input) {
        StringBuilder updatedString = new StringBuilder();

        for (int index = 0; index < input.length(); index++) {
            if (index == 0 || input.charAt(index - 1) == ' ') {
                updatedString.append(input.toUpperCase().charAt(index));
                continue;
            }
            updatedString.append(input.charAt(index));
        }
        return updatedString.toString();
    }
}

