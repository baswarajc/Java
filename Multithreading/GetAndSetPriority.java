package Multithreading;

public class GetAndSetPriority {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());  //5

        MyThread4 t1 = new MyThread4();
        System.out.println(t1.getPriority());   //5

//        Thread.currentThread().setPriority(15);  //RE: IllegalArgumentException

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());  //10


        MyThread4 t2 = new MyThread4();

        System.out.println(t1.getPriority());   //5
        System.out.println(t2.getPriority());   //10

    }
}

class MyThread4 extends Thread{

}