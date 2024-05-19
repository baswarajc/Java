package Collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {

    public static void main(String[] args) {

        TreeMap t = new TreeMap(new ComparatorForTreeMap());


        t.put("ZZZ",45);
        t.put("XXX",78);
        t.put("GGG",48);
        t.put("AAA",36);
        t.put("FFF",95);
        t.put(450,"DDD");


        System.out.println(t);    //  {ZZZ=45, XXX=78, GGG=48, FFF=95, AAA=36, 450=DDD}
    }
}


class ComparatorForTreeMap implements Comparator{

    public int compare(Object obj1, Object obj2){
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        return s2.compareTo(s1);
    }
}