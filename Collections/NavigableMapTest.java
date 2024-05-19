package Collections;

import java.util.TreeMap;

public class NavigableMapTest {

    public static void main(String[] args) {

        TreeMap<String,String> t = new TreeMap<String,String>();

        t.put("a","apple");
        t.put("c","cat");
        t.put("g","gun");
        t.put("b","ball");
        t.put("d","dog");

        System.out.println(t);

        System.out.println(t.floorKey("c"));  // c
        System.out.println(t.ceilingKey("e"));  // g
        System.out.println(t.lowerKey("b"));  // a
        System.out.println(t.higherKey("b")); // c
        System.out.println(t.pollFirstEntry());  // a=apple
        System.out.println(t.pollLastEntry());   // g=gun


        System.out.println(t.descendingMap());  // {d=dog, c=cat, b=ball}
        System.out.println(t);                  // {b=ball, c=cat, d=dog}
    }
}
