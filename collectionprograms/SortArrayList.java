package collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {

        Student s1 = new Student("Omkar",103,18);
        Student s2 = new Student("Vijay",102,19);
        Student s3 = new Student("Rajesh",101,10);
        Student s4 = new Student("Keshav",108,18);
        Student s5 = new Student("Ram",112,22);
        Student s6 = new Student("Sham",158,31);

        ArrayList l = new ArrayList();

        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);
        l.add(s6);

        Collections.sort(l);
        System.out.println(l);
    }
}
