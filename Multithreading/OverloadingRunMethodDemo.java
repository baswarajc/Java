package Multithreading;

public class OverloadingRunMethodDemo {
    public static void main(String[] args) {

        MyThread1 t= new MyThread1();
        t.start();

    }
}


class MyThread1 extends Thread{

    public void run(){

        System.out.println("no- argument method");

    }

    public void run(int a){

        System.out.println("int- argument method");

    }
}