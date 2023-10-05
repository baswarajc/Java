package BoxingAndUnboxng;

public class BoxingAndUnboxing {

    public static void main(String[] args) {

//        Boxing : The process of converting any primitive types into
//                 object of its corresponding wrapper class is known as boxing.

//        Unboxing: The process of converting object of wrapper type into
//                  its primitive datatype is known as unboxing.


        int a = 10;
        float b = 10.5f;
        char c = 'a';

        //Boxing
        Integer aa = a;
        Float bb = b;
        Character cc = c;

        //Unboxing
        int a1 = aa;
        float b1 = bb;
        char c1 = cc;


        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);

        System.out.println(a == aa); //true
        System.out.println(b == bb); //true
        System.out.println(c == cc); //true


        Integer x = 5;
        Float y = 10F;
        Character z = 'd';


        //Unboxing
        int xx = x;
        float yy = y;
        char zz = z;

//        We can store the null value in wrapper objects.

        Integer i = null;
//      int j = null; // error

    }
}
