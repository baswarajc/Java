package Exception;

public class MethodStack2 {

    static void test1(){
        test2();
        System.out.println("test1() method");
    }

    static void test2(){
        test3();
        System.out.println("test2() method");
    }

    static void test3(){
        test4();
        System.out.println("test3() method");
    }

    static void test4(){


        System.out.println("test4() method");
    }
    public static void main(String[] args) {

    }
}
