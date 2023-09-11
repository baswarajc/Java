package loop;

public class FactorialForLoop {
    public static void main(String[] args) {
        int n = 7;
        int m = n;
        int fact = 1;
        for (int i = 2; i<= n ; i++){
            fact = fact *i;
        }
        System.out.println("factorial of " + m +" is "+ fact);
    }
}
