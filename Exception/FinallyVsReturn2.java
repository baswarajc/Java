package Exception;

public class FinallyVsReturn2 {
    public static void main(String[] args) {

        System.out.println(test()); //999

    }

    public static int test(){

        try {
            return 777;
        }
        catch (Exception e){
            return 888;
        }

        finally {
            return 999;
        }
    }
}
