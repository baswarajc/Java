package collectionprograms;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {

    public static void main(String[] args) {
        Studentt s1 = new Studentt(101,"Rajesh",21,"Pune");
        Studentt s2 = new Studentt(102,"Somesh",11,"Pune");
        Studentt s3 = new Studentt(103,"Vikas",19,"Pune");
        Studentt s4 = new Studentt(104,"Ram",25,"Pune");
        Studentt s5 = new Studentt(105,"Vivekanand",27,"Pune");

        TreeSet t = new TreeSet(new StudentSortingNameLength());


        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);
        t.add(s5);

        System.out.println(t);
    }

}

class Studentt{

    int sid;
    String sname;
    int sage;
    String scity;

    public Studentt(int sid, String sname, int sage, String scity) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.scity = scity;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getSage() {
        return sage;
    }

    public String getScity() {
        return scity;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", scity='" + scity + '\'' +
                '}'+"\n";
    }
}

class StudentSortingAge implements Comparator<Studentt> {

    @Override
    public int compare(Studentt o1, Studentt o2) {
        return (o1.getSage()- o2.getSage());
    }
}

class StudentSortingName implements Comparator<Studentt>{

    public int compare(Studentt o1, Studentt o2){
        return o1.getSname().compareTo(o2.getSname());
    }
}

class StudentSortingId implements Comparator<Studentt>{

    public int compare(Studentt o1, Studentt o2){
        return o1.getSid()-o2.getSid();
    }
}

class StudentSortingNameLength implements Comparator<Studentt>{

    public int compare(Studentt o1, Studentt o2){
        return o1.getSname().length()-o2.getSname().length();
    }
}