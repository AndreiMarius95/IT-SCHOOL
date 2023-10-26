package practice.session16;

public class TestGreetingService {

    public static void main(String[] args) {
        //anonymous class
        GreetingService anonymousGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello " + message);
            }
        };
        anonymousGreetingService.greet("Maria");

        //lambda
        GreetingService lambdaGreetingService = message -> System.out.println("Hello " + message);
        lambdaGreetingService.greet("Maria");
    }
}