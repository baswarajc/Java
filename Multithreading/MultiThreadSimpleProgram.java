package Multithreading;

public class MultiThreadSimpleProgram extends Thread{

    public static void main(String[] args) throws InterruptedException {
        MultiThreadSimpleProgram t1 = new MultiThreadSimpleProgram();
        t1.setName("Thread1");
        MultiThreadSimpleProgram t2 = new MultiThreadSimpleProgram();
        t2.setName("Thread2");
        MultiThreadSimpleProgram t3 = new MultiThreadSimpleProgram();
        t3.setName("Thread3");
        //thread pool -> already created threads we have

        t1.start();
        t2.start();
        t3.start();

    }

    public  void run() {
        try {

            synchronized (this) {
                for (long i = 0; i < 3; i++) {
                    System.out.println( Thread.currentThread().getName() +
                            " and Counter is " + i);
                }
            }

        } catch (Exception ex) {

        }

    }
}
