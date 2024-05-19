package collectionprograms;

import java.util.ArrayList;
import java.util.*;

public class AddListElementsToVector {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add(22);
        al.add(32);
        al.add(82);
        al.add(28);

        ArrayList al1 = (ArrayList) al.clone();

        Vector v = new Vector();

        v.addAll(al);

        System.out.println(v);


        Vector<String> vector = new Vector<String>();
        vector.add("Java");
        vector.add("SQL");
        vector.add("HTML");
        vector.add("Spring");
        vector.add("AWS");
        vector.add("CSS");


        System.out.println(vector);

        System.out.println(vector.subList(0,3));

        System.out.println(vector.size());
        System.out.println(vector.capacity());


        List l = new ArrayList();

        l.add("CSS");
        l.add("HTML");
        l.add("Spring");

        System.out.println(l);


        System.out.println(vector);
//        vector.retainAll(l);
        vector.removeAll(l);

        System.out.println(vector);

    }
}
