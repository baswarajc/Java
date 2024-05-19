package Multithreading;


class ThreadDemo2 extends Thread{

    static Thread mt;
    @Override
    public void run() {

        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 1; i <= 10; i++){
            System.out.println("Child Thread"+ i);
        }
    }
}
public class JoinPractice1 {

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo2.mt = Thread.currentThread();
        ThreadDemo2 t = new ThreadDemo2();
        t.start();
//        t.join();
        for(int i = 1; i <= 10; i++){
            System.out.println("Main Thread"+ i);
        }
    }
}
