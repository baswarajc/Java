package Collections;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet t = new TreeSet(new MyComparator2());

        t.add(10);
        t.add(150);
        t.add(18);
        t.add(17);
        t.add(19);


        System.out.println(t);
    }

}
