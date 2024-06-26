package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();

        for (int i = 1; i<= 10 ; i++){
            l.add(i);
        }

        System.out.println(l);

        Iterator itr = l.iterator();

        System.out.println(itr.getClass());

        while (itr.hasNext()){

            Integer i = (Integer) itr.next();

            if (i % 2 == 0){
                System.out.println(i);
            }
            else {
                itr.remove();
            }
        }

        System.out.println(l);
    }
}
