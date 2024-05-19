package Collections;

import static java.util.Arrays.*;
import java.util.*;

public class SearchingArrayElements {

    public static void main(String[] args) {

        String [] s = {"Abc","Test","Java","Tata","Idea"};

        Arrays.sort(s);

        System.out.println(Arrays.toString(s));

        System.out.println(Arrays.binarySearch(s,"Java"));
        System.out.println(binarySearch(s,"Test"));
        System.out.println(binarySearch(s,"Spring"));

        Arrays.sort(s, new MyComparator7());

        System.out.println(Arrays.toString(s));

        System.out.println(Arrays.binarySearch(s,"Java"));
        System.out.println(binarySearch(s,"Test",new MyComparator7()));
        System.out.println(binarySearch(s,"Spring",new MyComparator7()));
    }
}


class MyComparator7 implements Comparator{

    public int compare(Object o1, Object o2){

        String s1 = o1.toString();
        String s2 = o2.toString();

        return s2.compareTo(s1);

    }
}
