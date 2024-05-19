package Map;

import java.util.HashMap;

public class FirstHashmap {
    public static void main(String[] args) {

        HashMap< String, String>  hm = new HashMap<>();

        hm.put("Rajesh", "Patil");
        hm.put("Somesh", "Biradar");

//        System.out.println(hm.get("Rajesh"));

        String s1 = new String("java");
        String s2 = new String("java");

        StringBuilder sb1 = new StringBuilder("tdit");
        StringBuilder sb2 = new StringBuilder("tdit");

        System.out.println(s1.equals(s2));
        System.out.println(sb1.equals(sb2));

        System.out.println("hashcode of s1 " + s1.hashCode());
        System.out.println("hashcode of s2 " + s2.hashCode());
        System.out.println("hashcode of sb1 " + sb1.hashCode());
        System.out.println("hashcode of sb2 " + sb2.hashCode());
    }
}
