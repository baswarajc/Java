package collectionprograms;

public class Student implements Comparable {
    String name;
    int rollno;
    int age;

    Student(String name, int rollno, int age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        Student s1 = (Student) o;
        return (this.age - s1.age);
    }

    public String toString(){
        return name + "-" + rollno + " " +age;
    }
}


    /*public int getEmpID(){
        return this.empID;
    }

    public String getEmpName(){
        return this.empName;
    }

    public String getEmpCity(){
        return this.empCity;
    }

    public double getEmpSal(){
        return this.empSal;
    }

    public void setEmpID(int empID){
        this.empID = empID;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public void setEmpCity(String empCity){
        this.empCity = empCity;
    }

    public void setEmpSal(double empSal){ this.empSal = empSal; }*/
