package Java8Features.lambda;

import java.util.*;

public class Simple {
    public static void main(String[] args) {
        List<String> colors =Arrays.asList("red","Green","Blue","orange","black","pink");
//        System.out.println(colors);

        for (String str: colors) {
            System.out.print(str + ", ");
        }

        System.out.println();

        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        for (String str: colors) {
            System.out.print(str + ", ");
        }


    }
}
