package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Rajesh",85);
        map1.put("Vikas",75);
        map1.put("Aniket",45);
        map1.put("Keshav",88);
        map1.put("Balaji",75);

        Set<String> set = map1.keySet();
        Set<String> set1 = new TreeSet<>();
        set1.addAll(set);
        System.out.println(set1);

        Collection collection  =  map1.values();
        List list = new ArrayList<>();
        list.addAll(collection);
        Collections.sort(list);
        System.out.println(list);

        Set set2 = new HashSet<>();
        set2.addAll(list);
        System.out.println("=========");
        System.out.println(list);
        System.out.println(set2);

        List list1 = map1.entrySet().stream().map(e-> e.getKey()).sorted().collect(Collectors.toList());
        List list2 = map1.entrySet().stream().map(e-> e.getValue()).sorted().collect(Collectors.toList());


        System.out.println(list1);
        System.out.println(list2);

//        Map map11 = map1.entrySet().stream().sorted(Map.Entry.comparingByKey((s1,s2) ->s1.length() - s2.length())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new);
//
//        Map<String, Integer> sortedStudentMap
//                = map1.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByKey((o1, o2) -> o1.length() - o2.length()))
//                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

    }
}
