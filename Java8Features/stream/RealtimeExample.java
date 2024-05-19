package Java8Features.stream;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

class Employee1{

    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee1(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "\n"+id + "-"+name+"-"+age+"-"+gender +"-"+department +"-"+yearOfJoining +"-"+salary;
    }
}
public class RealtimeExample {

    public static void main(String[] args) {

        List<Employee1> employeeList = new ArrayList<Employee1>();

        employeeList.add(new Employee1(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee1(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee1(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee1(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee1(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee1(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee1(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee1(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee1(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee1(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee1(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee1(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee1(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee1(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee1(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee1(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee1(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


//        System.out.println(employeeList);

//        employeeList.stream().map(Employee1::getDepartment).distinct().forEach(System.out::println);

//        List<String> demartmentList = employeeList.stream().map(Employee1::getDepartment).distinct().collect(Collectors.toList());
//
//        System.out.println(demartmentList);


//        Map genderCount = employeeList.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
//
//        System.out.println(genderCount);


        Map genderAverage = employeeList.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingDouble(Employee1::getAge)));
//
//        System.out.println(genderAverage);


        // details of highest paid employee
//        System.out.println(employeeList.stream().max(Comparator.comparing(Employee1::getSalary)));
//        System.out.println(employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee1::getSalary))));

//        employeeList.stream().filter(e -> e.getYearOfJoining()>2015).map(Employee1:: getName).forEach(System.out::println);
//
//
//        Map m3 = employeeList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.counting()));
//        System.out.println(m3);
//
//        Map m4 = employeeList.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.averagingDouble(Employee1::getSalary)));
//        System.out.println(m4);
//
//
//        System.out.println(employeeList.stream().filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development").min(Comparator.comparing(Employee1::getAge)));
//
//
//        //Who has the most working experience in the organization?
//        System.out.println(employeeList.stream().min(Comparator.comparing(Employee1::getYearOfJoining)).map(e -> e.getName()));
//
//        //How many male and female employees are there in the sales and marketing team?
//        Map map4 = employeeList.stream().filter(e -> e.getDepartment() == "Sales And Marketing").collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
//
//        System.out.println(map4);
//
//        //What is the average salary of male and female employees?
//        Map map5 = employeeList.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingDouble(Employee1::getSalary)));
//        System.out.println(map5);
//
//        // List down the names of all employees in each department
//        Map<String, List<Employee1>> map6 = employeeList.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
//
//
//        //What is the average salary and total salary of the whole organization?
//
//       System.out.println("average salary of the whole organization: "+ employeeList.stream().collect(Collectors.averagingDouble(Employee1::getSalary)));
//
//        System.out.println("total salary of the whole organization: "+ employeeList.stream().collect(Collectors.summingDouble(Employee1::getSalary)));
//
//        // Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
//
//        Map map6 = employeeList.stream().collect(Collectors.partitioningBy(e-> e.getAge() >= 25));
//        System.out.println(map6);


        //Who is the oldest employee in the organization? What is his age and which department he belongs to
        Employee1 oldestEmployee= employeeList.stream().max(Comparator.comparing(Employee1::getAge)).get();

        System.out.println("Name of oldest Employee in organization: "+ oldestEmployee.getName());
        System.out.println("Age of oldest Employee in organization: "+oldestEmployee.getAge());
        System.out.println("Department of oldest Employee in organization: "+oldestEmployee.getDepartment());














    }

}
