package string;

public class CountChar {
    public static void main(String[] args) {
        String s = "Java is programming language";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
