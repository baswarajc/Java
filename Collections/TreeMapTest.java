package Collections;

import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        TreeMap t = new TreeMap();

        t.put(120,'D');
        t.put(101,'A');
        t.put(103,'B');
        t.put(170,'F');
        t.put(105,'C');
        t.put(145,'E');

        System.out.println(t);  // {101=A, 103=B, 105=C, 120=D, 145=E, 170=F}



        TreeMap t1 = new TreeMap();

        t1.put(100,"XXX");
        t1.put(102,"YYY");
        t1.put(104,1500);
        t1.put(106,"AAA");
//      t1.put("FFF",100);   // ClassCastException
//      t1.put(null,"DDD");  // NullPointerException

        System.out.println(t1);  // {100=XXX, 102=YYY, 104=1500, 106=AAA}

    }
}
