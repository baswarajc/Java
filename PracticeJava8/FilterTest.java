package PracticeJava8;

import java.util.*;
import java.util.stream.Collectors;

public class FilterTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(10,45,58,65,45,35,69,25));
//        System.out.println(list);
//        List<Integer> list1 = list.stream().filter(n -> n > 50).collect(Collectors.toList());
//        System.out.println(list1);
//        list.stream().filter(n -> n > 50).forEach(System.out::println);

//        List list2 = list.stream().map(n -> n*2).collect(Collectors.toList());
//        List list3 = list.stream().map(n -> n*2).distinct().collect(Collectors.toList());
//        List list4 = list.stream().map(n -> n*2).distinct().sorted().collect(Collectors.toList());
//        List list5 = list.stream().map(n -> n*2).distinct().sorted().limit(3).collect(Collectors.toList());
//
//        System.out.println(list4);
//        System.out.println(list5);

        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        System.out.println(names.stream().findFirst().get());


//        names.stream().sorted((name1, name2) -> (name1.length() > name2.length())?1:(name1.length()< name2.length()?-1:0)).forEach(System.out::println);
//        names.stream().sorted((name1, name2) -> name1.length() - name2.length()).forEach(System.out::println);

//        System.out.println(names.stream().max((name1,name2)->name1.length() - name2.length()).get());

        if (names.stream().anyMatch((String name) -> name.length() == 5)){
            System.out.println("");
        }
    }
}
