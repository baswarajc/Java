package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListInReverseOrder {


    public static void main(String[] args) {
        List l = new ArrayList();

        l.add("XAbb");
        l.add("Jbcd");
        l.add("Ecde");
        l.add(0,"Abcd");
        l.add("Eamdlm");
        l.add("dfnk");
        l.add("NHDK");
        l.add(4,"Kqwdkpd");

        l.remove(3);

        System.out.println(l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
    }
}
