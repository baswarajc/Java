package collectionprograms;

import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        ht.put(1,"Raj");
        ht.put(2,"Rajesh");
        ht.put(4,"Ram");
        ht.put(3,"Sham");
        ht.put(5,"Vijay");

        Set s = ht.keySet();

        Iterator itr = s.iterator();

        while (itr.hasNext()){
            Integer a =(Integer) itr.next();
            System.out.println("key = "+ a + ", Value =  "+ht.get(a));
        }

        Hashtable ht1 =(Hashtable) ht.clone();

        System.out.println(ht.containsKey(4));
        System.out.println(ht.containsKey(6));

        System.out.println(ht.containsValue("Sham"));
        System.out.println(ht.containsValue("Shamrao"));

        System.out.println(ht.entrySet());
//        ht.clear();
        System.out.println(ht);
    }
}
