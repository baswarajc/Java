package Collections;

import java.util.*;

public class IdentityHashMapDemo {

    public static void main(String[] args) {

        Integer I1 = new Integer (100);
        Integer I2 = new Integer (100);

        HashMap m = new HashMap();


        m.put(I1,"Java");
        m.put(I2,"Spring");

        System.out.println(m);


        IdentityHashMap m1 = new IdentityHashMap();

        m1.put(I1,"Java");
        m1.put(I2,"Spring");

        System.out.println(m1);
    }
}
