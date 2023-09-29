package ProgrammingPractice;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 74;
        int count = 0;

        for (int i =2; i<n; i++ ){
            if(n%i == 0){
                count++;
            }
        }

        if(count == 0){
            System.out.println(n + " is prime number");
        }
        else{
            System.out.println(n + " is not prime number");
        }
    }
}
