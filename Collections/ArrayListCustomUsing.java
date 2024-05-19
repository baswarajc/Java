package Collections;

public class ArrayListCustomUsing {
    public static void main(String[] args) {

        ArrayListCustom test = new ArrayListCustom();

        ArrayListCustom<Integer> test2 = new ArrayListCustom();

        test2.add(78);
        test2.add(45);

        test.add(10);
        test.add(20);
        test.add("abcd");
        test.add(40);
        test.add('a');
        test.add(60);
        test.add(70);
        test.add(85.250);
        test.add(true);
        test.add(100);
        test.add(false);

        System.out.println(test.get(2));
        System.out.println(test.get(4));

//        test.get(11);
//
        test.display();

        System.out.println(test.get(6));

        test.remove(6);

        test.display();

        System.out.print("test2 == ");
        test2.display();
    }
}
