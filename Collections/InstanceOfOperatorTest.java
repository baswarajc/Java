package Collections;

import java.util.RandomAccess;

public class InstanceOfOperatorTest implements RandomAccess{

    public static void main(String[] args) {

        InstanceOfOperatorTest test = new InstanceOfOperatorTest();

        System.out.println(test instanceof InstanceOfOperatorTest);
        System.out.println(test instanceof RandomAccess);

    }



}
