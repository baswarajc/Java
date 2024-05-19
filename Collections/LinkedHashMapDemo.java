package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {public static void main(String[] args) {
    HashMap m = new HashMap();

    m.put("Vijay", 200);
    m.put("Vikas", 800);
    m.put("Raju", 700);
    m.put("Somesh", 400);
    m.put("Omkar", 600);

    System.out.println(m);


    LinkedHashMap m1 = new LinkedHashMap();

    m1.put("Vijay", 200);
    m1.put("Vikas", 800);
    m1.put("Raju", 700);
    m1.put("Somesh", 400);
    m1.put("Omkar", 600);

    System.out.println(m1);
}

}
