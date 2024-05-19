package Exception;

public class First {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}

//        int c;
//
//        System.out.println("Start");
//
////         c = a/b;
////        System.out.println("Value of c = "+c);
//         try {
//             c = a/b ;
//             System.out.println("Value of c = "+c);
//         }
//
//         catch (Exception e){
//             System.out.println("Exception Handled");
//             e.getStackTrace();
//         }
//
//        System.out.println("End");
//    }
//}
