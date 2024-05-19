package Collections;

import java.util.*;

public class SortingListCSO {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("K");
        l.add("N");
        l.add("A");

        System.out.println(l);

        Collections.sort(l,new MyComparator4());

        System.out.println(l);
    }

}


class MyComparator4 implements Comparator{

    public int compare(Object o1, Object o2){

        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }

}