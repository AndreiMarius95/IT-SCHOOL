package practice.session16;

public class ThreadPractice {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Running in a separated thread");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}