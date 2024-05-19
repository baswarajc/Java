package Collections;

import ProgrammingPractice.Tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<Integer>();

        t.add(10);
        t.add(20);
        t.add(30);
        t.add(40);
        t.add(50);
        t.add(60);
        t.add(70);

        System.out.println(t);

//        System.out.println(t.floor(3100));
//        System.out.println(t.lower(3000));
//        System.out.println(t.ceiling(55));
//        System.out.println(t.ceiling(50));
//        System.out.println(t.higher(55));
//        System.out.println(t.higher(50));
//        System.out.println(t.higher(60));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
//
//        System.out.println(t);
//        System.out.println(t.descendingSet());
    }
}
