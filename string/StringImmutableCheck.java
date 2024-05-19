package string;

public class StringImmutableCheck {

    static void addressCheck(String s1, String s2){
       if(s1 == s2){
           System.out.println("Same Address");
       }
       else{
           System.out.println("Different Address");
       }
    }

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("Before Changes");

        addressCheck(s1,s2);

        s1 = s1 + "Programing";

        System.out.println("After changes");

        addressCheck(s1,s2);
    }
}
