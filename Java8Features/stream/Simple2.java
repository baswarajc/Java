package Java8Features.stream;

import java.util.*;
import java.util.stream.Stream;

public class Simple2 {
    public static void main(String[] args) {
        Stream<String> ss =Stream.empty();
        System.out.println(ss.count());

        Stream s1 = Stream.of("Omkar");

        System.out.println(s1.count());

        Stream<Integer> i = Stream.of(1,8,21,45,15,45);

        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("One");

        listOfStrings.add("Two");

        listOfStrings.add("Three");


        Stream s2 = Stream.of(listOfStrings);


    }
}
