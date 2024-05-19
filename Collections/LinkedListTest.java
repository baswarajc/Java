package Collections;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        l.add("first");
        l.add(1);
        l.add(true);
        l.add("first");
        l.add(null);
        System.out.println(l);

        l.set(3,"third");
        System.out.println(l);

        l.remove();
        System.out.println("test "+ l);

        l.add(3,"fourth");
        System.out.println(l);

        l.addFirst(8);
        l.addLast(4);
        System.out.println(l);

        l.remove();
        System.out.println(l);

        l.remove();
        System.out.println(l);

        l.removeLast();
        System.out.println(l);

        l.set(1,1);
        System.out.println(l);



    }
}
