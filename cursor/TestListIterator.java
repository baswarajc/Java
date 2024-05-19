package cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();

        for (int i = 1; i<= 20 ; i++){
            l.add(i);
        }

        System.out.println(l);

        ListIterator ltr = l.listIterator();

        System.out.println(ltr.getClass());

        while(ltr.hasNext()){

            Integer i = (Integer) ltr.next();
            if(i %2 == 0){

                ltr.remove();

            } else if ( i % 3 == 0) {

                ltr.add(i*10);

            } else if ((i % 5 == 0)) {

                ltr.set(i*100);

            }
        }

        System.out.println(l);
    }
}
