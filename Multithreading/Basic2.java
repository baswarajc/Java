package Multithreading;

class DemoThread1 implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            System.out.println("Child Thread");
        }
    }
}
public class Basic2 {

    public static void main(String[] args) {

        DemoThread1 r = new DemoThread1();
        Thread t = new Thread(r);
        t.start();

        for(int i = 1; i <= 10; i++){
            System.out.println("Main Thread");
        }
    }

}
