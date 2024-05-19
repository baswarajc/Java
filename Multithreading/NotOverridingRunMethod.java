package Multithreading;

public class NotOverridingRunMethod {
    public static void main(String[] args) {

        MyThread2 t= new MyThread2();
        t.start();

    }
}


class MyThread2 extends Thread{


}

