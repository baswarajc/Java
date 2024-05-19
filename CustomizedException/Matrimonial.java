package CustomizedException;

import java.util.Scanner;

public class Matrimonial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
         int age = sc.nextInt();

         if(age <= 18){
             throw new ToYoungException("your age is low wait for some time");
         }
         else if(age > 50) {
             throw new ToOldException("your age is crossed the marriage age no chance to get match");
        }
         else{
             System.out.println("Welcome to site, you will get match soon");
         }

    }
}
