package Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.SortedMap;

class Student implements Comparable<Student>{

    int ID;
    String Name;
    String Add;
    int Sal;

    public int getID(){
        return ID;
    }

    public String getName(){
        return Name;
    }

    public String getAdd(){
        return Add;
    }

    public int getSal(){
        return Sal;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void setAdd(String Add){
        this.Add = Add;
    }

    public void setSal(int Sal){
        this.Sal = Sal;
    }

    Student(int ID, String Name, String Add, int Sal){
        this.ID = ID;
        this.Name = Name;
        this.Add = Add;
        this.Sal = Sal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Add='" + Add + '\'' +
                ", Sal=" + Sal +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}

public class ComparableTest {
    public static void main(String[] args) {

        List<Student> l1 = new ArrayList<>();

        Student s1 = new Student(101, "Raj", "Pune",7000);
        Student s2 = new Student(102, "Vicky", "Latur",8000);
        Student s3 = new Student(103, "Keshav", "Mumbai",4500);
        Student s4 = new Student(104, "Vijay", "Katraj",8800);


        l1.add(s3);
        l1.add(s4);
        l1.add(s2);
        l1.add(s1);

        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);



    }
}
