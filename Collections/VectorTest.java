package Collections;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector v = new Vector(10,3);

        v.add(1);
        System.out.println(v);
        System.out.println(v.capacity());
        for (int i = 1; i< 9; i++){
            v.add(i);
        }

        v.add('A');
        v.add('B');
        System.out.println(v);
        System.out.println(v.capacity());

        v.add('A');
        v.add('B');
        v.add('B');
        v.add('B');
        System.out.println(v);
        System.out.println(v.capacity());



    }
}
