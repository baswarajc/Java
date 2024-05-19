package PracticeJava8;

import java.util.*;
import java.util.stream.Collectors;

class Student
{
    String name;

    int id;

    String subject;

    double percentage;

    public Student(String name, int id, String subject, double percentage)
    {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public String getSubject()
    {
        return subject;
    }

    public double getPercentage()
    {
        return percentage;
    }

    @Override
    public String toString()
    {
        return name+"-"+id+"-"+subject+"-"+percentage;
    }
}


public class Collectors1 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));

        List list = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(list);

        Set<String> subject = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
        System.out.println(subject);

        Map map = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
        System.out.println(map);

        LinkedList list1 = studentList.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(list1);

        String names = studentList.stream().map(Student::getName).collect(Collectors.joining(", "));
        System.out.println(names);

        System.out.println(studentList.stream().collect(Collectors.counting()));

        Double d = studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        System.out.println(d);

        Double d1 = studentList.stream().map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder())).get();
        System.out.println(d1);

        Double d2 = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));

        System.out.println(d2);

        Double d3 = studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage));

        System.out.println(d3);

        Map<String, List<Student>> map1 = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));

        System.out.println(map1);

        Map<Boolean, List<Student>> map2 = studentList.stream().collect(Collectors.partitioningBy((Student s) -> s.getPercentage() > 80));

        System.out.println(map2);
    }
}
