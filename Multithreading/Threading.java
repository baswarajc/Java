package Multithreading;

public class Threading extends Thread {

    public static void main(String[] args) throws InterruptedException {

        Threading t1 =new Threading();
        Threading t2 =new Threading();
        Threading t3 =new Threading();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

        t1.run();
        t2.run();
        t3.run();



    }

    public void run(){

        synchronized (this) {
            for (int i = 1; i < 4; i++) {

                System.out.println(currentThread().getName() + " counter " + i);
            }
        }
    }
}
