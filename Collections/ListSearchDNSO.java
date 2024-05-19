package Collections;

import java.util.*;
public class ListSearchDNSO {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        l.add("R");
        l.add("A");
        l.add("L");
        l.add("G");
        l.add("s");

        System.out.println(l); // [R, A, L, G, s]

        Collections.sort(l);

        System.out.println(l);  // [A, G, L, R, s]


        System.out.println(Collections.binarySearch(l,"R"));   //3
        System.out.println(Collections.binarySearch(l,"H"));   //-3
    }
}
