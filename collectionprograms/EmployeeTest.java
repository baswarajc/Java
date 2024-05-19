package collectionprograms;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{

    int empID;
    String empName;
    String empCity;
    double empSal;

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public double getEmpSal() {
        return empSal;
    }

    Employee(int empID, String empName, String empCity, double empSal){

        this.empID =  empID;
        this.empName = empName;
        this.empCity = empCity;
        this.empSal = empSal;
    }

    public String toString(){
        return empID+"-"+empName+"-"+empCity+"-"+empSal;
    }

}

class EmpIDComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
//        int ID1 = (int) o1.empID;
//        int ID2 = (int) o2.empID;
//        return ID1 - ID2;
        return o1.getEmpID() -o2.getEmpID();
    }
}

class EmpNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
//        String name1 = (String) o1.empName;
//        String name2 = (String) o2.empName;
//        return name1.compareTo(name2);
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}

class EmpCityComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
//        String name1 = (String) o1.empCity;
//        String name2 = (String) o2.empCity;
//        return name1.compareTo(name2);
        return o1.getEmpCity().compareTo(o2.getEmpCity());
    }
}

class EmpSalComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
//        int sal1 = (int) o1.empSal;
//        int sal2 = (int) o2.empSal;
//        return sal1 - sal2;
        return (int) (o1.getEmpSal() - o2.getEmpSal());
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
       Employee e1 = new Employee(101,"Rajesh","Pune",35365.25);
       Employee e2 = new Employee(105,"Balaji","Indore",33528.55);
       Employee e3 = new Employee(108,"Amol","Hinjewadi",40528.36);
       Employee e4 = new Employee(104,"Ram","Magarpatta",52365.32);
       Employee e5 = new Employee(103,"Omkar","Baramati",45365.95);


        ArrayList l = new ArrayList();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e5);

        System.out.println(l);
        EmpIDComparator empIDcomp = new EmpIDComparator();
        Collections.sort(l,empIDcomp);
        System.out.println("Sorting Based on ID: " + l);
        EmpNameComparator empNamecomp = new EmpNameComparator();
        Collections.sort(l,empNamecomp);
        System.out.println("Sorting Based on Name: " + l);
        EmpCityComparator empCitycomp = new EmpCityComparator();
        Collections.sort(l,empCitycomp);
        System.out.println("Sorting Based on City: " + l);
        EmpSalComparator empSalcomp = new EmpSalComparator();
        Collections.sort(l,empSalcomp);
        System.out.println("Sorting Based on Sal: " + l);

    }
}
