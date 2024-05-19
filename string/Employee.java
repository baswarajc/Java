package string;

import java.util.ArrayList;
import java.util.*;

public class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Employee e = new Employee(1, "Test");
        Employee e1 = new Employee(1, "Test");
        System.out.println(e.equals(e1));


        List<Employee> sl = new ArrayList<>();
        sl.add(e);
        sl.add(e1);

        System.out.println(sl.size());

        Set<Employee> ss = new HashSet<>();
        ss.add(e);
        ss.add(e1);

        Set<Integer> si = new HashSet<>();
        si.add(45);
        si.add(45);

        System.out.println(ss);
        System.out.println(si);
        System.out.println(si.size());
    }



}
