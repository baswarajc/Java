package collectionprograms;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> al =new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        LinkedList al2 = (LinkedList) al.clone();

        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        System.out.println(list);


        al2.addAll(list);

        System.out.println(al2);

        String [] arr = new String[al.size()];

        al.toArray(arr);



        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");


//        Collections.sort(list1, new ListComparator());
//        System.out.println(list1);

        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println("shuffle  "+list1);
        System.out.println(list1);
        Collections.swap(list1,0,2);
        System.out.println("swap  "+list1);

        System.out.println();
        System.out.println(list1);
        list1.addFirst("Coconut");
        list1.addLast("Orange");
        System.out.println(list1);

        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());



    }
}

class ListComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }

//    public int compare(Object o1,Object o2){
//        String s1 = (String) o1;
//        String s2 = (String) o2;
//        return s2.compareTo(s1);
//    }
}