package homework.session6;

public class ConcatenateMultipleStrings {

        public static void main(String[] args) {
            String[] strArray1 = {"Michael", "Nike", "Coca-Cola" , "Itschool"};
            System.out.println(concatenateStrings(strArray1));
        }

        private static String concatenateStrings(String[] strArray) {
            StringBuilder bigString = new StringBuilder();
            for (int index = 0; index < strArray.length; index++) {
                bigString.append(strArray[index] + " ");
            }
            return bigString.toString();
        }
    }

