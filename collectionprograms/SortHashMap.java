package collectionprograms;

import Collections.MyComparator2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<String,String>();

        m.put("D", "Dog");
        m.put("def","DEF");
        m.put("A", "Apple");
        m.put("C", "Cat");
        m.put("B", "Ball");

        System.out.println(m);

        Map<Integer,Integer> m1 = new HashMap<Integer,Integer>();

        m1.put(6,36);
        m1.put(3,9);
        m1.put(2,4);
        m1.put(1,1);
        m1.put(5,25);
        m1.put(4,16);

        System.out.println(m1);


        Map<Integer,Integer> m3 = new TreeMap<Integer,Integer>(new MyComparator9());

        m3.put(6,36);
        m3.put(3,9);
        m3.put(2,4);
        m3.put(1,1);
        m3.put(5,25);
        m3.put(4,16);

        System.out.println(m3);

        Map<String,String> m2 = new TreeMap<String,String>(new MyComparator10());



        m2.put("D", "Dog");
        m2.put("def","DEF");
        m2.put("A", "Apple");
        m2.put("C", "Cat");
        m2.put("B", "Ball");

        System.out.println(m2);

    }
}

class MyComparator9 implements Comparator{

    public int compare(Object obj1,Object obj2){
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;

        if (i1 > i2){
            return -1;
        } else if (i1 < i2) {
            return +1;
        }else {
            return 0;
        }
    }
}

class MyComparator10 implements Comparator{

    public int compare(Object o1, Object o2){
        String s1 = o1.toString();
        String s2 = o2.toString();

        return s2.compareTo(s1);
    }
}