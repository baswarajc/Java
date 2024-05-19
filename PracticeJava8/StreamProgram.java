package PracticeJava8;

import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamProgram {

    public static void main(String[] args) {
        String s = "brbfkbfkjbf";

        System.out.println(s.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        Map map  = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        List list1 = cars.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(list1);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(17);
        list.add(14);
        list.add(21);
        list.add(16);
        list.add(58);

        Integer min = list.stream().min(Comparator.naturalOrder()).get();
        Integer max = list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(min);
        System.out.println(max);

        list.stream().filter(n-> n%3==0).forEach(System.out::println);

        System.out.println("============================");

        list.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("============================");

        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        System.out.println("============================");
        int[] intArray1 = new int[]{ 1,12,35,45,5,66,27,88,98,10 };
        int[] intArray2 = new int[]{ 10,30,20,40,70,60,50,80,90,100 };

        int[] intArray3 =  IntStream.concat(Arrays.stream(intArray1),Arrays.stream(intArray2)).distinct().sorted().toArray();

        System.out.println(Arrays.toString(intArray3));

    }
}
