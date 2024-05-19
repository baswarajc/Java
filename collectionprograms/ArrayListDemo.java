package collectionprograms;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        System.out.println(list);

        //Convert ArrayList to Array

        String [] arr = new String[list.size()];
        list.toArray(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(list.subList(0,3));

        Collections.reverse(list);

        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
