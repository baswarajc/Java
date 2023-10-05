package ProgrammingPractice;

// write a program to print all number from 1-100 just don’t print numbers like 10,20,30,40….100

public class Print1To100WithoutDivisibleBy10 {

    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(i%10 == 0){

            }
            else{
                System.out.println(i);
            }
        }
    }
}
