package Exception;

public class ExampleNumberFormatException {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = "ten";
        String s3 = null;

        int a = Integer.parseInt(s1);
        System.out.println(a);  // 10
        int b = Integer.parseInt(s2);  // NumberFormatException
        int c = Integer.parseInt(s3);  // NumberFormatException

    }
}
