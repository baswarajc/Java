package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MethodStack {

    static void test1() throws FileNotFoundException {
        test2();
        System.out.println("test1() method");
    }

    static void test2() throws FileNotFoundException {
        test3();
        System.out.println("test2() method");
    }

    static void test3()  {
        try {
            test4();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("test3() method");
    }

    static void test4() throws FileNotFoundException {
        FileInputStream MethodStack = new FileInputStream("/Desktop/GFG.txt");
        System.out.println("test4() method");
    }

    public static void main(String[] args)  {

        try {
            test1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("main() method");
    }
}
