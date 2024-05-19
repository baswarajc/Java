package collectionprograms;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateListInReverseOrder {
    public static void main(String[] args) {

        LinkedList<String> al =new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Sham");
        al.add("Vikas");
        al.add("Ram");
        al.add("Ajay");

// Iterate List in reverse order
        Iterator itr = al.descendingIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(al);
        System.out.println(al.pop());
        System.out.println(al);
        al.push("Ravi2");
        System.out.println(al);

        al.remove("Abcd");
        System.out.println(al);
        al.remove("Vijay");
        al.remove(2);
        System.out.println(al);
        System.out.println(al.remove());
    }
}
