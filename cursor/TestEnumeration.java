package cursor;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

    public static void main(String[] args) {

        Vector v = new Vector();

        for (int i = 1; i<= 10; i++){
            v.add(i);
        }

        Enumeration e = v.elements();

        System.out.println(e.getClass());

        while(e.hasMoreElements()){
            Integer i = (Integer) e.nextElement() ;

            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println(v);
    }
}
