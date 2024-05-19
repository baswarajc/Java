package collectionprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<String,String>();

        m.put("A", "Apple");
        m.put("B", "Ball");
        m.put("C", "Cat");
        m.put("D", "Dog");

        System.out.println(m);

        System.out.println(m.keySet());

        System.out.println(m.values());

        System.out.println(m.get("C"));

        System.out.println(m.remove("A"));

        m.replace("B","Ball","Bat");
        m.put("E","Elephant");

        System.out.println(m);
        System.out.println(m.entrySet());

        Iterator itr = m.entrySet().iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
