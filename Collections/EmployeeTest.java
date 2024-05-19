package Collections;

import ProgrammingPractice.Tree;

import java.util.*;
import java.lang.*;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee(105, "Rajesh");
        Employee e2 = new Employee(110, "Rupesh");
        Employee e3 = new Employee(145, "Vijay");
        Employee e4 = new Employee(187, "Amol");
        Employee e5 = new Employee(152, "Keshav");
        Employee e6 = new Employee(108, "Rajesh");

        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        t.add(e6);

        System.out.println(t);

        TreeSet t1 = new TreeSet(new EmployeeComparator());


        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        t1.add(e6);

        System.out.println(t1);

    }


}
