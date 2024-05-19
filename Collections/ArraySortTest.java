package Collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortTest {

    public static void main(String[] args) {

        int [] intarr = {14,8,25,1};
        System.out.print("int array before sorting         ");
        for (int intarr1: intarr) {

            System.out.print(intarr1+" ");

        }

        Arrays.sort(intarr);
        System.out.println();

        System.out.print("int array after sorting          ");
        for (int intarr1: intarr) {

            System.out.print(intarr1+" ");

        }

        System.out.println();

        String [] s = {"Ghi", "Def", "Xyz", "Abc"};

        System.out.print("String array before sorting      ");

        for(String s1: s){

            System.out.print(s1+ " ");
        }

        System.out.println();
        Arrays.sort(s);

        System.out.print("String array after sorting       ");
        for(String s1: s){

            System.out.print(s1+ " ");
        }

        System.out.println();

        String [] ss = {"Ghi", "Def", "Xyz", "Abc"};

        System.out.print("String array before sorting      ");

        for(String s1: ss){

            System.out.print(s1+ " ");
        }

        System.out.println();
        Arrays.sort(ss, new MyComparator6());

        System.out.print("String array after customized sorting     ");
        for(String s1: ss){

            System.out.print(s1+ " ");
        }
    }
}


class MyComparator6 implements Comparator{

    public int compare(Object o1, Object o2){

        String s1 = o1.toString();
        String s2 = o2.toString();

        return s2.compareTo(s1);
    }
}
