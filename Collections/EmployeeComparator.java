package Collections;

import java.util.Comparator;

public class EmployeeComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {

        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        String name1 = (String) e1.name;
        String name2 = (String) e2.name;

        return name1.compareTo(name2);
    }
}
