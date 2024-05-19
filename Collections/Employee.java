package Collections;

public class Employee implements Comparable {

    int eid;
    String name;

    Employee(int eid, String name){
        this.eid = eid;
        this.name = name;
    }

    @Override
    public String toString() {
        return  eid + "--" + name;
    }

    @Override
    public int compareTo(Object o) {
        int eid1 = this.eid;
        Employee e = (Employee) o;
        int eid2 = e.eid;

        if(eid1 > eid2 ){

            return +1;
        } else if (eid1 < eid2) {

            return -1;
        } else{
            return 0;
        }

    }
}
