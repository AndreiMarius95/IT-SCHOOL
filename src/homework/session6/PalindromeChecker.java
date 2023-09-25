package homework.session6;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "level";
        checkPalindrome(str);
        checkPalindrome(str2);
    }

    public static void checkPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String reversed = stringBuilder.reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("This is a palindrome word.");
        } else {
            System.out.println("This isn't a palindrome word.");
        }
    }
}
//////////////////////////////////////////////
