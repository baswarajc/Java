package Exception;
import java.lang.*;

public class ClassForNameMethod {

    String name = "Working";
    void test() {

        System.out.println("test method");
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        ClassForNameMethod obj1 = new ClassForNameMethod();
//        obj1.test();


        try {

            Class cls = Class.forName("ClassForNameMethod");

            // Creating object of main class
            // using instance method
            ClassForNameMethod obj = (ClassForNameMethod)cls.newInstance();

            // Print and display
            System.out.println(obj.name);

        }
        catch (ClassNotFoundException e) {

            // Display the exception along with line number
            // using printStacktrace() method
            e.printStackTrace();
        }

        // Catch block 2
        // Handling InstantiationException
        catch (InstantiationException e) {

            e.printStackTrace();
        }

        // Catch block 2
        // Handling IllegalAccessException
        catch (IllegalAccessException e) {

            e.printStackTrace();
        }
    }
}
