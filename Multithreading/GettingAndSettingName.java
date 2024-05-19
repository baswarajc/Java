package Multithreading;

class MyThread3 extends Thread{

    public void run(){
        System.out.println("run method executed by Thread : "+ Thread.currentThread().getName());  //run method executed by Thread : Thread-0
    }
}
public class GettingAndSettingName {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());  //main

        MyThread3 t1 = new MyThread3();
        System.out.println(t1.getName());   // Thread-0

        MyThread3 t2 = new MyThread3();
        System.out.println(t2.getName());    // Thread-1

        t1.start();
        System.out.println("main method executed by Thread : "+ Thread.currentThread().getName());  //main method executed by Thread : main


//        System.out.println(10/0);   //Exception in thread "main"

        Thread.currentThread().setName("Joke");
        System.out.println(Thread.currentThread().getName());  //

//        System.out.println(10/0);   //Exception in thread "Joke"

        t1.setName("XYZ");
        System.out.println(t1.getName());   //XYZ
    }

}
