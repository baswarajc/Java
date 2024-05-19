package collectionprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set s = new HashSet();

        System.out.println(s.size());

        s.add(45.25);
        s.add("Xyz");
        s.add('S');
        s.add("Abcd");
        s.add(5);
        s.add("Xyz");

        Set s1 = new LinkedHashSet();

        s1.add(45.25);
        s1.add("Xyz");
        s1.add('S');
        s1.add("Abcd");
        s1.add(5);
        s1.add("Xyz");

        System.out.println(s);
        System.out.println(s1);




    }
}
