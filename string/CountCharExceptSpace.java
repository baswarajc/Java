package string;

public class CountCharExceptSpace {
    public static void main(String[] args) {
        String s = "Java is programming language";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(s.length());
        System.out.println(s.length()- count);
    }
}
