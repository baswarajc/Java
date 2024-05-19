package Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionExample {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("test.txt");
        pw.println(pw);
    }
}
