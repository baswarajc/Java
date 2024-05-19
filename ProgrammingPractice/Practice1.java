package ProgrammingPractice;
import java.io.*;
import java.util.*;
import java.util.*;

public class Practice1 {

    public static void main(String[] args) {
        String s = "abcdcbefghe";

        char [] ch = s.toCharArray();

        Set<Character> set = new HashSet<>();

        for (char chh: ch) {
            if (!set.add(chh)){
                System.out.println(chh);
            }
        }

    }
}

class Duplicate{
    public static void main(String[] args) {
        String ss= "hello java";

        ArrayList<Character> ll = new ArrayList<>();

        for (char ch: ss.toCharArray()) {
            if (ll.contains(ch)){
                System.out.println(ch);
            }
            else {
                ll.add(ch);
            }
        }
    }
}

 class Main {

    public static void permutations(String str) {
        List<String> ans = new ArrayList<>();
        ans.add(String.valueOf(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            for (int j = ans.size() - 1; j >= 0; j--) {
                String temp = ans.remove(j);
                for (int k = 0; k <= temp.length(); k++) {
                    ans.add(temp.substring(0, k) + str.charAt(i) + temp.substring(k));
                }
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "ABC";
        if (str.length() == 0 || str == null) {
            return;
        }
        permutations(str);
    }
}

// npr= n! / (n-r)!
