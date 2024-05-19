package Multithreading;

class DemoThread extends Thread{
    @Override
    public void run() {
//        for(int i = 1; i <= 10; i++){
        System.out.println("Child Thread");
//        }
    }

    public void start(){
        super.start();
        System.out.println("start by us");
    }
}

public class Basic {
    public static void main(String[] args) {

        DemoThread t = new DemoThread();
        t.start();

//        for(int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
//        }
    }
}


