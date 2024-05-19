package collectionprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraversArrayList {

    public static void main(String[] args) {

     /*   List list = new ArrayList();

        list.add(10);
        list.add('a');
        list.add("kd");
        list.add("abcd");
        list.add(true);
        list.add(null);

        System.out.println(list);

//        for (Object o: list) {
//            System.out.println(o);
//        }

        Iterator litr = list.iterator();

        while (litr.hasNext()){
            System.out.println(litr.next());
        }

        System.out.println(list);
*/


    List<Integer> l1 = new ArrayList<Integer>();

        l1.add(40);
        l1.add(47);
        l1.add(70);
        l1.add(45);
        l1.add(62);
        l1.add(59);

        System.out.println("Original List: " + l1);

    Iterator<Integer> ltr2 = l1.iterator();

        while (ltr2.hasNext()) {
        Integer value = ltr2.next();
        if (value % 2 == 0) {

            System.out.println(value);
        } else {
            ltr2.remove();
        }
    }

        System.out.println("List after removal of odd numbers: " + l1);


        System.out.println(l1.contains(40));
        System.out.println(l1.contains(78));
        System.out.println(l1.contains("abcd"));
    }
}
