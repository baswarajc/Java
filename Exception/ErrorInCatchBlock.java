package Exception;

public class ErrorInCatchBlock {


//    public static void test(){
//        System.out.println("test");
//        demo();
//    }
//
//    public static void demo(){
//        System.out.println("demo");
//        try {
//            test();
//        }
//        catch(Throwable e){
//            System.out.println("catch block");
//        }
//
//    }
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (Throwable e){
            System.out.println("Catch block");
        }
    }
}
