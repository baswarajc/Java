package Java8Features.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Simple {
    public static void main(String[] args) {

//        IntStream.of( new int[] {14,38,12,52,41,36,57}).filter(i -> i >40).distinct().forEach(System.out::println);

        List<String> list = new ArrayList<String>();

        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("white");
        list.add("black");

//        list.stream().filter((String colors) -> colors.length() > 4).skip(1).forEach(System.out::println);

        Stream<String> stream = list.stream();

//        stream.forEach(System.out::println);
//        stream.forEach(System.out::println);

        list.stream().forEach(System.out::println);
        System.out.println();
        list.stream().forEach(System.out::println);
    }
}
