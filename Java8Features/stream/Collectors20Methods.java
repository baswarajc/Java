package Java8Features.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collectors20Methods {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,1,3,8,5,4,6,9,7);
        List<Integer> integers1 = integerList.stream().map( x -> x*x).collect(Collectors.toList());

        System.out.println(integerList);
        System.out.println(integers1);

        List<Integer> greaterList = integerList.stream().filter(x -> x>5).collect(Collectors.toCollection(LinkedList::new));
        List<Integer> smallerList = integerList.stream().filter(x -> x<=5).collect(Collectors.toCollection(LinkedList::new));

        System.out.println(greaterList);
        System.out.println(smallerList);

        Long sumcount = integerList.stream().filter(x -> x%2 == 0).collect(Collectors.counting());

        Long oddcount = integerList.stream().filter(x -> x%2 != 0).collect(Collectors.counting());

        System.out.println(sumcount);
        System.out.println(oddcount);


        Integer min = integerList.stream().min(Comparator.naturalOrder()).get();
        Integer min1 = integerList.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();

        System.out.println(min);
        System.out.println(min1);


        List<String> strings = Arrays.asList("alpha","beta","gamma");
//        strings.add("sigma");


        String minstring = strings.stream().min(Comparator.naturalOrder()).get();
        String minstring1 = strings.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();

        System.out.println(minstring);
        System.out.println(minstring1);

        Map<Boolean, List<Integer>> map = integerList.stream().collect(Collectors.partitioningBy(x -> x >5 ));

        System.out.println(map);


        List<String> strings2 = new ArrayList<>();
        strings2.add("alpha");
        strings2.add("beta");
        strings2.add("gama");

        List<String> unmodifiableList = strings2.stream().collect(Collectors.toUnmodifiableList());

        strings2.add("sigma");
//        unmodifiableList.add("sigma");  // RE: UnsupportedOperationException

        String all = strings2.stream().collect(Collectors.joining(""));

        System.out.println(all);

        Double integersAverage = integerList.stream().collect(Collectors.averagingInt(x -> x*2));
        System.out.println(integersAverage);

        Map<String, Integer> map1 = strings2.stream().collect(Collectors.toMap(Function.identity(), String :: length));

        System.out.println(map1);

        Integer integersSum = integerList.stream().collect(Collectors.summingInt(x -> x));

        System.out.println(integersSum);


        IntSummaryStatistics integerListSummary = integerList.stream().collect(Collectors.summarizingInt(x ->x));

        System.out.println(integerListSummary.getMax());
        System.out.println(integerListSummary.getMin());
        System.out.println(integerListSummary.getSum());
        System.out.println(integerListSummary.getCount());
        System.out.println(integerListSummary.getAverage());


        Map map2 = strings2.stream().collect(Collectors.groupingBy(String:: length));

        System.out.println(map2);
    }

}


