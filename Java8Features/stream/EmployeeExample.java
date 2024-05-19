package Java8Features.stream;

import java.util.*;


public class EmployeeExample {
    public static void main(String[] args) {

        List<Employee> empList = getEmpList();

        // filter the employees list with gender as Female
//        empList.stream().filter(e -> e.getGender().equals("Female")).forEach(System.out::println);

        //filter the employees list with newJoiner as True
//        empList.stream().filter(e -> e.getNewJoiner().equals("True")).forEach(System.out::println);

        // sort the employee list by rating ascending
//        empList.stream().sorted(Comparator.comparing(Employee::getRating)).forEach(System.out::println);

        // sort the employee list by rating descending
//        empList.stream().sorted(Comparator.comparing(Employee::getRating).reversed()).forEach(System.out::println);

        // sort the employee list by both rating and salary
//        empList.stream().sorted(Comparator.comparing(Employee::getSalary))
//                .sorted(Comparator.comparing(Employee::getRating)).forEach(e -> System.out.println(e));

        System.out.println(empList.stream().max(Comparator.comparing(Employee::getSalary)).get().getFirstName());
        System.out.println(empList.stream().max(Comparator.comparing(Employee::getSalary)).get().getLastName());
    }

    public static List<Employee> getEmpList(){
        return Arrays.asList(
                new Employee("59-385-1088","Zacharias","Schwerin","zchwerin@gmail.com","Male","True",101146,0),
                new Employee("73-274-6476","Kyle","Frudd","kfrudd1@ovh.net","Male","FALSE",29310,2),
                new Employee("85-939-9584","Axe","Gumb","agumb2@twitter.com","Female","FALSE",62291,4),
                new Employee("08-180-8292","Robinet","Batterham","rbatterham3@last.fm","Male","FALSE",142439,4),
                new Employee("21-825-2623","Ulick","Burrel","uburrel4@google.ru","Male","FALSE",128764,5),
                new Employee("66-708-5539","Tailor","Ridding","Ridding","Female","FALSE",152924,4),
                new Employee("81-697-2363","Joete","Braybrooke","jbraybrooke6@prnewswire.com","Male","TRUE",128907,0),
                new Employee("63-019-1110","Elroy","Baverstock","ebaverstock7@ehow.com","Male","TRUE",2510,0)
        );

    }
}

class Employee {

    private String empId;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String newJoiner;
    private int salary;
    private int rating;

    public Employee() {
    }

    public Employee(String empId, String firstName, String lastName, String email, String gender, String newJoiner, int salary, int rating) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.newJoiner = newJoiner;
        this.salary = salary;
        this.rating = rating;
    }

    public String getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getNewJoiner() {
        return newJoiner;
    }

    public int getSalary() {
        return salary;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", newJoiner='" + newJoiner + '\'' +
                ", salary=" + salary +
                ", rating=" + rating +
                '}';
    }

}