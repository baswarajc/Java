package collectionprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);

        Iterator<Integer> itr = al.iterator();

        while (itr.hasNext()){

            Integer n = itr.next();
            if (n % 2 == 0){
                System.out.println(n);
            }
            else{
                itr.remove();
            }
        }

        System.out.println(al);
    }

}
