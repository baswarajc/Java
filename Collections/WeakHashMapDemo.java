package Collections;

import java.util.*;

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {

        Temp t1 = new Temp();

        HashMap m = new HashMap();

        m.put(t1,"Java");

        System.out.println(m);

        t1 =null;

        System.gc();
        Thread.sleep(1000);

        System.out.println(m);




        Temp t2 = new Temp();

        WeakHashMap m1 = new WeakHashMap();

        m1.put(t2,"Spring");

        System.out.println(m1);

        t2 =null;

        System.gc();
        Thread.sleep(1000);

        System.out.println(m1);
    }


}


class Temp
{
    public String toString(){
        return "temp";
    }

    public void finalize(){
        System.out.println("finalize method called");
    }
}
