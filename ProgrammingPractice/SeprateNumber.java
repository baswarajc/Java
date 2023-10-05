package ProgrammingPractice;

public class SeprateNumber {

    public static void test(int n){
        if(n>0){
            int m = (n/10)*10;
            int temp = n;
            n = n/10;
            System.out.println(temp-m);
            test(n);
//            System.out.println(temp-m);

        }
    }
    public static void main(String[] args) {
        int n = 475821;
        test(n);
    }
}
