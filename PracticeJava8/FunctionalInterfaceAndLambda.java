package PracticeJava8;
//create a functional interface and implement it with lambda expression
interface XYZ{

    void sum(int a, int b);
}
public class FunctionalInterfaceAndLambda {

    public static void main(String[] args) {
        XYZ obj = (a,b) -> System.out.println(a+b);
        obj.sum(56,58);
    }
}
