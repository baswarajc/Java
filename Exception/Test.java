package Exception;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws java.lang.Exception {
//        throw new Exception();
//        throw new Error();
        try {
            int a = 5 / 0;
        }
//        catch (Exception e) {
//            System.out.println("Exception");
//        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
           // throw new ArithmeticException();
        }
        System.out.println("Afer code");
    }
}


