package Java8Features;

interface ClassA{
    abstract void demo();

    default void test(){

        System.out.println("This is ClassA test method");
    }

}


interface ClassB{
    abstract void demo();

    default void test(){

        System.out.println("This is ClassB test method");
    }

}

public class ClassD implements ClassA, ClassB {

    @Override
    public void demo() {

    }

    @Override
    public void test() {
        ClassB.super.test();
    }

    public static void main(String[] args) {

        ClassD obj1 = new ClassD();

        obj1.test();

    }
}
