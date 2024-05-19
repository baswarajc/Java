package Exception;

public class ControlFlowTryCatchFinally {
    public static void main(String[] args) {
        try{
            System.out.println("statement - 1");
            System.out.println(10/0);
            System.out.println("statement - 3");
        }
        catch (ArithmeticException e){
            System.out.println("statement - 4");
        }

        finally {
            System.out.println("statement - 6");
        }

        System.out.println(10/0);
    }
}
