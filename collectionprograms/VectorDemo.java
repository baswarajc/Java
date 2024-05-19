package collectionprograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(12);
        al.add(22);
        al.add(32);
        al.add(82);
        al.add(28);
//        al.add(87);

        System.out.println(al);

        Vector v = new Vector(al);

        System.out.println(al.getClass().getName());
        System.out.println(v.getClass().getName());

//        for (Object a:
//             v) {
//            System.out.println(a);
//        }

        Vector newv = (Vector) v.clone();
        Iterator itr = v.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        al.add(87);
        System.out.println(newv);


        Vector<String> vector = new Vector<String>();
        vector.add("Java");
        vector.add("SQL");
        vector.add("HTMl");
        vector.add("CSS");

        String [] arr = new String[vector.size()];
        vector.copyInto(arr);

        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
    }
}
