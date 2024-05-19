package Exception;

public class ClassNotFoundExceptionTest {
    public static void main(String[] args) {

        try {
            Class.forName("ClassNotFoundExceptionTest");
        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);

//            e.printStackTrace();
            System.out.println("Catch-End");
        }
    }
}
