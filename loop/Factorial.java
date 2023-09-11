package loop;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int m = n;
        int fact = 1;
        while (n>1){
            fact = fact *n;
            n--;
        }
        System.out.println("factorial of " + m +" is "+ fact);
    }
}
