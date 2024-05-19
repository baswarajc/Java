package Collections;

import java.util.Arrays.*;
import java.util.*;

public class ConversionArrayToList {

    public static void main(String[] args) {

        String []  s ={"A", "Z", "B"};
        List l = Arrays.asList(s);

        System.out.println(l);
        s[0] = "W";

        System.out.println(l);

        l.set(1,"E");

        for(String s1 : s){
            System.out.println(s1);
        }

//        l.add("ED");   //  RE: UnsupportedOperationException
//        l.remove(2);  //  RE: UnsupportedOperationException

//        l.set(2,new Integer(10));  // RE: ArrayStoreException
    }
}
