package Multithreading;

public class PriorityDemo {
    public static void main(String[] args) {


        MyThread5 t1 = new MyThread5();
        t1.setPriority(10);
        t1.start();

            for(int i = 0; i < 10; i++){
                System.out.println("main thread");
            }
    }
}


class MyThread5 extends Thread{

    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("child thread");
        }
    }
}