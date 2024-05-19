package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest2 {

    public static void main(String[] args) {

        PriorityQueue q = new PriorityQueue(20,new MyComparator3());

        q.offer("ZZZ");
        q.offer("AAA");
        q.offer("CCC");
        q.offer("QQQ");

        System.out.println(q);
    }
}


class MyComparator3 implements Comparator{

    public int compare(Object obj1, Object obj2){

        String s1 = obj1.toString();
        String s2 = obj2.toString();

        return s2.compareTo(s1);
    }
}
