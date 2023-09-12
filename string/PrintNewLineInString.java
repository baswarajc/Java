package string;

public class PrintNewLineInString {
    public static void main(String[] args) {

        System.out.println("abc"+ "\n" +"def");

        String newLine = System.lineSeparator();
        System.out.println("abc" + newLine + "def");
    }
}
