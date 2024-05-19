package Multithreading;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException{
        MyThread6.mt = Thread.currentThread();
        MyThread6 t = new MyThread6();
        t.start();
        t.join();
        for (int i = 1 ; i <= 10 ;i++){
            System.out.println("Rama Thread "+ i);
        }
    }
}

class MyThread6 extends Thread{

    static Thread mt;
    public void run(){
//        try {
////            mt.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for (int i = 1 ; i <= 10 ;i++){
            System.out.println("Seeta Thread "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}