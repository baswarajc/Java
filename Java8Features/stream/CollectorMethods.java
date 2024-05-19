package Java8Features.stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorMethods {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,63,4,31,56,89,12,41);

        List<Integer> sumnumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddnumbers = numbers.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(sumnumbers);
        System.out.println(oddnumbers);

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

        List<Student> top3students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());

        System.out.println(top3students);

        List<String> subjectList = studentList.stream().map(Student::getSubject).collect(Collectors.toList());

        System.out.println(subjectList);

        Map<String, Double> namePercentageMap = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));

        System.out.println(namePercentageMap);

        LinkedList<Student> sl = studentList.stream().collect(Collectors.toCollection(LinkedList::new ));

        System.out.println(sl);

        String namesjoined = studentList.stream().map(Student::getName).collect(Collectors.joining(","));

        System.out.println(namesjoined);

        long studentcount = studentList.stream().collect(Collectors.counting());

        System.out.println(studentcount);


        Optional<Double> maxpercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));

        System.out.println(maxpercentage);

        Optional<Double> minpercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder()));

        System.out.println(minpercentage);

        Double sumofpercentage = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));

        System.out.println(sumofpercentage);

        Double averageOfPercentage = studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage));

        System.out.println(averageOfPercentage);

        Map<String, List<Student> > groupBySubject = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));

        System.out.println(groupBySubject);

        Map<Boolean, List<Student>> partionByPercentage = studentList.stream().collect(Collectors.partitioningBy(Student -> Student.getPercentage() > 80.0));

        System.out.println(partionByPercentage);
    }
}

class Student{

    String name;
    int id;
    String subject;
    double percentage;


    public Student(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    public String toString() {
        return name+"-"+id+"-"+ subject+"-"+ percentage;
    }
}