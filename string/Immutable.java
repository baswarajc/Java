package string;

public final class Immutable {

    private final String name;
    private final int sal;
    private final float cgpa;

    public String getName(){
        return name;
    }

    public int gatSal(){
        return sal;
    }

    public float getCgpa(){
        return cgpa;
    }

    public Immutable(String Name, int Sal, float Cgpa){
        this.name = Name;
        this.sal = Sal;
        this.cgpa = Cgpa;
    }
}
