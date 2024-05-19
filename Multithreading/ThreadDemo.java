package Multithreading;

public class ThreadDemo {

    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();
//        t.run();
        for(int i=0; i<40; i++){

            System.out.println("Main Thread");
        }

    }
}

class MyThread extends Thread{

    public void run(){

        for(int i=0; i<40; i++){

            System.out.println("Child Thread");
        }

    }
}