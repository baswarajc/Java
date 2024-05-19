package Collections;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add('A');
        al.add("hello");
        al.add(null);

        ArrayList all = new ArrayList();

        all.add(10);
        all.add('A');
        all.add("hello");
        all.add(null);

        System.out.println(al);
        al.remove("hello");
        System.out.println(al);
        al.remove(0);

        System.out.println(al);

        al.addAll(all);

        System.out.println(al);
    }
}
