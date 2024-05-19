package Exception;

public class UseOfThrows {
    public static void main(String[] args) throws java.lang.InterruptedException {
        doStuff();
    }
    public static void doStuff()throws java.lang.InterruptedException {
        doMoreStuff();
    }
    public static void doMoreStuff() throws java.lang.InterruptedException {
        Thread.sleep(1000);

    }
}
