package collectionprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, Student1> map = new HashMap<>();

        Student1 s1 = new Student1("Vijay", "Mechanical");
        Student1 s2 = new Student1("Rajesh", "Comp");
        Student1 s3 = new Student1("Keshav", "IT");
        Student1 s4 = new Student1("Rahul", "Mechanical");
        Student1 s5 = new Student1("Somesh", "Mechanical");
        Student1 s6 = new Student1("Madhav", "IT");
        Student1 s7 = new Student1("Vikas", "Comp");
        Student1 s8 = new Student1("Manoj", "IT");

        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);
        map.put(4, s4);
        map.put(5, s5);
        map.put(6, s6);
        map.put(7, s7);
        map.put(8, s8);

//        System.out.println(map);

        Set set = map.entrySet();

        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getValue());
        }
    }
}

class Student1{

    String name;
    String branch;

    public Student1(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }



    @Override
    public String toString() {
        return "(name=" + name + ", branch=" + branch + ')';
    }
}