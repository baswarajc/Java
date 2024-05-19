package Collections;

import java.util.*;

public class ListSearchCSO {

    public static void main(String[] args) {

        ArrayList l = new ArrayList();

        l.add(15);
        l.add(45);
        l.add(20);
        l.add(0);
        l.add(60);

        System.out.println(l);   // [15, 45, 20, 0, 60]

        Collections.sort(l,new MyComparator5());

        System.out.println(l);  //   [60, 45, 20, 15, 0]


        System.out.println(Collections.binarySearch(l,15,new MyComparator5()));
        System.out.println(Collections.binarySearch(l,18,new MyComparator5()));
        System.out.println(Collections.binarySearch(l,45,new MyComparator5()));
        System.out.println(Collections.binarySearch(l,45));
        System.out.println(Collections.binarySearch(l,58,new MyComparator5()));
    }
}


class MyComparator5 implements Comparator{

    public int compare(Object o1, Object o2){

        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        return i2.compareTo(i1);
    }
}