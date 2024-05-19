package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(55);
        ll.add(47);
        ll.add(65);
        ll.add(21);

        System.out.println(ll);
        System.out.println(ll.getClass().getName());
        ArrayList al= new ArrayList(ll);
        System.out.println(al);
        System.out.println(al.getClass().getName());

        Collections.reverse(al);
        System.out.println(al);

        HashSet h = new HashSet();

        h.add(15);
        h.add(true);
        h.add("Java");

        Object [] arr = h.toArray();
        int [] arr1 = {15,152,45,12};

//        System.out.println(arr.getClass().getName());
//        System.out.println(arr1.getClass().getName());

    }
}
