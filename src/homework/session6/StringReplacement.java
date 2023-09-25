package homework.session6;

public class StringReplacement {

    public static void main(String[] args) {
        String str = "Iasi is located in Romania, more precisely in Europe, more precisely on planet Earth ";
        System.out.println(replaceTargetWithString(str, "Iasi", "Europe")); /// :))no sens
    }

    private static String replaceTargetWithString(String input, String target, String newValue) {
        StringBuilder updatedString = new StringBuilder();
        String[] mainArr = input.split(" ");

        for (int index = 0; index < mainArr.length; index++) {
            if (mainArr[index].equals(target)) {
                updatedString.append(newValue + " ");
                continue;
            }
            updatedString.append(mainArr[index] + " ");
        }
        return updatedString.toString();
    }
}
