package collectionprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TraversHashSet {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("A");
        s.add("AA");
        s.add("B");
        System.out.println(s.add("A"));
        s.add('a');
        s.add(true);
        s.add(100);
        s.add(10);
        s.add(10);

        System.out.println(s);

//        for (Object o: s) {
//            System.out.println(o);
//        }

        Iterator itr = s.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
