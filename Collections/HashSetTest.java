package Collections;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {

        Set s = new HashSet();

        s.add('a');
        s.add(1);
        s.add(10);
        s.add(null);
        s.add('a');
        s.add('b');
        s.add('Z');

        s.remove('a');



        System.out.println(s);

        List l = new ArrayList();

        l.add(20);
        l.add(true);
        l.add(78);
        l.add("Java");
        l.add(true);

        System.out.println(l);

        s.addAll(l);

        System.out.println(s);

        System.out.println(s.size());


        HashSet h = new HashSet(l);

        System.out.println(h);

        l.add(41);
        l.add(71);
        l.add(45);
        l.add(47);


        SortedSet ss = new TreeSet();

        ss.addAll(l);

        System.out.println(ss);
    }


}
