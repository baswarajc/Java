package Java8Features.lambda;

import java.util.ArrayList;
import java.util.function.*;

public class Simple2 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Blue");
        list.add("Orange");
        list.add("Pink");
        list.add("Red");

//        list.forEach(n -> System.out.println(n));
        Consumer<String> test = n -> System.out.println(n) ;

        list.forEach(test);

        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(5);
        l.add(15);
        l.add(8);
        l.add(12);
        l.add(1);

        Consumer<Integer> demo = (n) -> System.out.println(n);

        l.forEach(demo);

    }
}
