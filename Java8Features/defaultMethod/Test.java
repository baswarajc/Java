package Java8Features.defaultMethod;

interface Demo{
    default void foo(){
        System.out.println("Demo-foo");
    }
}

interface Check{
    default void foo(){
        System.out.println("Check-foo");
    }

}
public class Test implements Demo,Check {
    @Override
    public void foo() {
        Demo.super.foo();
        Check.super.foo();
//        System.out.println("Test-foo");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.foo();
    }
}
