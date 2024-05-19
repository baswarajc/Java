package PracticeJava8;

import java.util.*;
import java.util.stream.Collectors;

public class RealTimeExample {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(map);
        //System.out.println("Male " +map.get("Male").stream().count());
        //System.out.println("Female " +map.get("Female").stream().count());

        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println("========================");

        Map map1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));

        System.out.println(map1);

        System.out.println("========================");

        Employee e = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
        System.out.println(e);

        System.out.println("========================");

        employeeList.stream().filter(employee -> employee.yearOfJoining > 2015).map(Employee::getName).forEach(System.out::println);
        System.out.println("========================");

        Map map2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(map2);

        System.out.println("========================");

        Map map3 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(map3);

        System.out.println("========================");

        System.out.println(employeeList.stream().filter(employee -> employee.getDepartment() == "Product Development").min(Comparator.comparing(Employee::getAge)));
        System.out.println("========================");

        System.out.println(employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).get());
        System.out.println("========================");

        Map map4 = employeeList.stream().filter(employee -> employee.getDepartment() == "Sales And Marketing" ).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(map4);
        System.out.println("========================");

        Map map5 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(map5);
        System.out.println("========================");
        Map map6 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(map6);

        Set set = map6.entrySet();


        System.out.println("========================");

        DoubleSummaryStatistics summaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary = "+summaryStatistics.getAverage());
        System.out.println("Total Salary = "+summaryStatistics.getSum());


        System.out.println("========================");

        Map<Boolean, List<Employee>>  map7 = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge()<= 25));
        System.out.println(map7);

        List<Employee> list1 = map7.get(false);
        List<Employee> list2 = map7.get(true);

        System.out.println("Employees younger than or equal to 25 years ");
        for (Employee ee: list2){
            System.out.println(ee.getName());
        }

        System.out.println("Employees older than 25 years ");
        for (Employee ee: list1){
            System.out.println(ee.getName());
        }
        System.out.println("========================");

        Employee oldestEmployee = employeeList.stream().max((Employee e1, Employee e2) -> e1.getAge() -e2.getAge()).get();

        System.out.println("Name : "+oldestEmployee.getName());

        System.out.println("Age : "+oldestEmployee.getAge());

        System.out.println("Department : "+oldestEmployee.getDepartment());


    }
}