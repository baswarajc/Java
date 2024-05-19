package Collections;

import java.util.*;

public class SortedSetTest {

    public static void main(String[] args) {

        SortedSet ss = new TreeSet();

        ss.add(10);
        ss.add(40);
        ss.add(80);
        ss.add(50);
        ss.add(88);
        ss.add(800);
        ss.add(100);


        System.out.println(ss);
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet(50));
        System.out.println(ss.tailSet(88));
        System.out.println(ss.subSet(40,88));

    }


}
