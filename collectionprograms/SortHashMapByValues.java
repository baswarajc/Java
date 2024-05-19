package collectionprograms;

import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMapByValues {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        map.put(10,100);
        map.put(40,400);
        map.put(20,200);
        map.put(30,300);
        map.put(50,500);

        System.out.println(map);

//        TreeMap tmap = new TreeMap(map);
//        System.out.println(tmap);


    }
}
