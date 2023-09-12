package string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen" ;
        String s2 = "silent" ;

        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String ss1 = new String(ch1);
        String ss2 = new String(ch2);

        if (ss1.equals(ss2)){
            System.out.println(s1 + " and " + s2 + " are anagram");
        }
        else{
            System.out.println(s1 + " and " + s2 + " are not anagram");
        }
    }
}
