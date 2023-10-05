package ProgrammingPractice;

public class LeapYear {
    public static void main(String[] args) {
        int yr = 1500;

        if (yr%4 == 0){
            if(yr%100 == 0){
                if(yr%400 == 0) {
                    System.out.println(yr + " leap year");
                }
                else{
                    System.out.println(yr + " not a leap year");
                }
            }
            else{
                System.out.println(yr + " leap year");
            }
        }
        else {
            System.out.println(yr + " not a leap year");
        }
    }
}
