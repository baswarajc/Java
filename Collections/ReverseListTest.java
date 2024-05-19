package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseListTest {

    public static void main(String[] args) {

        ArrayList l = new ArrayList();

        l.add(15);
        l.add(45);
        l.add(20);
        l.add(0);
        l.add(60);

        System.out.println(l);

        Collections.reverse(l);

        System.out.println(l);
    }
}
