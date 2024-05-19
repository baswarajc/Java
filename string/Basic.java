package string;

import java.util.HashMap;

public class Basic {

    public static void main(String[] args) {

        //equals() method compare the actual value it is carrying
        // == operator compare the memory address of string

        //using new keyword
        String str1 = new String("School");
        String str2 = new String("School");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        str1.hashCode();

        //using string literals
        String s1 = "School";
        String s2 = "School";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        String ss1 = "";
        String ss2 = null;

        System.out.println(ss1 == ss2);
        System.out.println(ss1.equals(ss2));


        System.out.println(s1 == str1);
        System.out.println(s1.equals(str1));

        HashMap h = new HashMap<>();

    }
}
