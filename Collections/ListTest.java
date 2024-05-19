package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(3);
        l1.add(40);
        l1.add(1);
        l1.add(4);

        Collections.sort(l1);

//        l1.remove(2);

        Collections.reverse(l1);

        Iterator it = l1.iterator();

        while(it.hasNext()){
            int i = (int)it.next();
            if(i % 2 == 0){
                it.remove();
            }
        }

        l1.add(99);
        System.out.println(l1);
    }
}
