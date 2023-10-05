package BoxingAndUnboxng;

public class PrimitiveTypesToWrapperObjects {

    public static void main(String[] args) {

        int a = 10;
        char c = 's';

        //converts into wrapper object
        Integer obj1 = Integer.valueOf(a);
        Character obj2 = Character.valueOf(c);

        Integer obj3 = a;
        Character obj4 = c;


        //Line no 11 & Line no 14 are same.
        //Line no 12 & Line no 15 are same


    }
}
