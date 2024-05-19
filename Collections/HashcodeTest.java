package Collections;

public class HashcodeTest {

    @Override
    public int hashCode() {
        return 111;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcd";
        String s3 = "efgh";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        HashcodeTest ob1 = new HashcodeTest();
        HashcodeTest ob2 = new HashcodeTest();

//        System.out.println(ob1);
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());

    }

}
