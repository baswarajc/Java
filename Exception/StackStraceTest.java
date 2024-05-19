package Exception;

public class StackStraceTest {
    public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff(){
        doMoreStuff();
    }

    public static void doMoreStuff(){
        System.out.println("Hello");
        System.out.println(10/0);
    }
}
