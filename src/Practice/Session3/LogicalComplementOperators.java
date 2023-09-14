package Practice.Session3;

public class LogicalComplementOperators {
    public static void main(String[] args) {
        boolean isFirstTime = true;
        boolean isRegistered = false;

        System.out.println(!isFirstTime);
        System.out.println(!isRegistered);

        double myDouble = 32.5;
        int myInt = 23;

        System.out.println(myDouble > myInt);
        System.out.println(myDouble <= myInt);
    }
}
