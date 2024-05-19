package Java8Features.stream;

import java.util.*;
import java.util.stream.Stream;

public class SelectionOperations {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("David");
        names.add("Johnson");
        names.add("Bhim");
        names.add("Kaliya");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        names.add("Johnson");
        names.add("Samontika");


        //names having more than 5 letters
//        names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);

//        System.out.println();

        //names having more than 5 letters only once(no duplicate)

//        names.stream().filter((String name) -> name.length() > 5).distinct().forEach(System.out::println);

        //Selecting first four names

//        names.stream().limit(4).forEach(System.out::println);

        //Skipping first five names

//        names.stream().skip(5).forEach(System.out::println);


        //Returns length of each name

//        names.stream().map(String :: length).forEach(System.out::println);

        //sorted according to natural sorting order

//        names.stream().sorted().forEach(System.out::println);

        //sorted reverse of alphabetical order

//        names.stream().sorted((String name1,String name2)-> name2.compareTo(name1)).forEach(System.out::println);

        //sorting according to length

//        names.stream().sorted((String name1, String name2) ->name1.length()-name2.length()).forEach(System.out::println);


//        int sum = Arrays.stream(new int [] {0,5,8,3,7,12,5}).reduce(0,(a,b) -> a+b);
//        System.out.println(sum);


        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(5);
        al1.add(10);
        al1.add(20);
        al1.add(50);
        al1.add(25);

        Integer min2 = al1.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min2);

//        int min1 = Arrays.stream(new int[]{4,18,2,4,6,8,12,14}).min();
//        System.out.println("min is "+min1);


        List<String> namess = new ArrayList<>();

        namess.add("David");

        namess.add("Johnson");

        namess.add("Samontika");

        namess.add("Brijesh");

        namess.add("John");

        long s = namess.stream().filter((String name) -> name.length() > 5).count();

        System.out.println(s);

//      anyMatch()   -- returntype - boolean
        if (names.stream().anyMatch((String name) -> name.length() == 5)){
            System.out.println("There is name available with 5 char");
        }


//      allMatch()   -- returntype - boolean

        if (names.stream().allMatch((String name)-> name.length() >=4)){
            System.out.println("All names are big");
        }


//      noneMatch()   -- returntype - boolean

        if (names.stream().noneMatch((String name)-> name.length() == 3 )){
            System.out.println("there is no name with 3 letters");
        }

        //findFirst()  -- return first element
        Optional<String> firstname = names.stream().findFirst();

        System.out.println(firstname);

        // findAny()  -- return any random element

        Optional<String> anyname = names.stream().findAny();

        System.out.println(anyname);


        Stream.of("First", "Second", "Second", "Third", "Fourth").limit(3).distinct().forEach(System.out::println);
        // First Second

        Stream.of("First", "Second", "Second", "Third", "Fourth").distinct().limit(3).forEach(System.out::println);
        // First Second Third


//       toArray() -- Returns an array containing elements of a stream.


    }
}
