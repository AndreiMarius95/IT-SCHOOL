package homework.session6;

public class RemovingVowels {
    public static void main(String[] args) {
        String str = "Iasi-Romania-Europa-Terra-Universe";
        removeVowels(str);
    }

    public static void removeVowels(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String vowels = "AaEeIiOoUu";


        for (char character : str.toCharArray()) {
            if (vowels.indexOf(character) < 0) {
                stringBuilder.append(character);
            }
        }
        System.out.println(stringBuilder);
    }
}

