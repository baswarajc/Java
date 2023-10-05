package ProgrammingPractice;

public class SmallestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 30;

        if(a<b && a<c){
            System.out.println(a + " is smallest number");
        }

        else if (b<c && b<a) {
            System.out.println(b + " is smallest number");
        }
        else {
            System.out.println(c + " is smallest number");
        }
    }
}
