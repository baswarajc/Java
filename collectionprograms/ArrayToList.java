package collectionprograms;

import java.util.*;

public class ArrayToList {
    public static void main(String[] args) {
        Integer [] arr = {34,35,134,545,67,789,24};

        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(arr));

        String [] sarr ={"Abcd","Code","Program","Write","Read"};

        ArrayList<String> s1 = new ArrayList<>(Arrays.asList(sarr));

        System.out.println(l);
        System.out.println(s1);

        System.out.println(l.size());
        System.out.println(s1.size());
    }
}
