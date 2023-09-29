package ProgrammingPractice;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 15;

        System.out.println(a);
        System.out.println(b);
        for (int i =0; i <(n-2); i++){

            System.out.println(a+b);
            int temp = a;
            a = b;
            b = temp + b;
        }

    }
}
