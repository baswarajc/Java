package collectionprograms;

import com.sun.source.doctree.SeeTree;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IterateTreeMap {

    public static void main(String[] args) {
        Map<String,String> t = new TreeMap<String,String>();
        t.put("Key1","Value1");
        t.put("Key3","Value3");
        t.put("Key2","Value2");
        t.put("Key5","Value5");
        t.put("Key4","Value4");

        System.out.println(t);

        Set s =  t.entrySet();

        System.out.println(s);

        Iterator itr = s.iterator();

//        for (String s: itr){
//            System.out.println(s);
//        }

        while (itr.hasNext()){
            Map.Entry itr1 = (Map.Entry) itr.next();
            System.out.print(itr1.getKey()+"   ");
            System.out.println(itr1.getValue());
        }
    }

}
