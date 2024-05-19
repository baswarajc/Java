package Collections;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap m = new HashMap();

        m.put("Vijay", 200);
        m.put("Vikas", 800);
        m.put("Raju", 700);
        m.put("Somesh", 400);
        m.put("Omkar", 600);


        System.out.println(m);
        System.out.println(m.get("Vikas"));

        Set s = m.keySet();
        System.out.println(s);

        Collection c = m.values();
        System.out.println(c);


        Set s1 = m.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();

        while (itr.hasNext()){

            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey()+"--"+m1.getValue());

            if(m1.getKey() == "Omkar"){
                m1.setValue(888);
            }
        }

        System.out.println(m);
    }
}
