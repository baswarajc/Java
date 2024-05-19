package collectionprograms;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(11);
        list2.add(1);
        list2.add(4);
        list2.add(14);
        list2.add(51);
        list2.add(3);
        list2.add(11);
        list2.add(14);

//        Collections.sort(list2);
//        for (int o:list2) {
//            System.out.println(o);
//        }

        for (int i:list2) {
            if (i > 5 && list2.indexOf(i) == list2.lastIndexOf(i)){
                System.out.println(i);
            }
        }
//        System.out.println(list2);
//        System.out.println(list2.indexOf(11));
//        System.out.println(list2.lastIndexOf(11));

//        Set<Integer> set = new TreeSet<Integer>(list2);
//
//        for (Integer a: set) {
//            if (a>5){
//                System.out.println(a);
//            }
//        }
    }
}
