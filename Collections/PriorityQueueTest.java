package Collections;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        PriorityQueue q = new PriorityQueue();

        System.out.println(q.peek());   //null
//      System.out.println(q.element());  // java.util.NoSuchElementException

        System.out.println(q.poll());   // null
//      System.out.println(q.remove());  // java.util.NoSuchElementException

        for (int i = 0; i <= 10; i++){
            q.offer(i);
        }

        System.out.println(q.peek());     // 0
        System.out.println(q.element());  // 0

        System.out.println(q);    //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println(q.poll());   // 0

        System.out.println(q);  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(q.remove());  //1

        System.out.println(q);  // [    2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}
