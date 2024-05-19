package loop;

public class Insurance {
    public static void main(String[] args) {
        System.out.println("Hello World");
        double finalamount = 1000000;
        double investment = 20000;
        double currentamount = 0;
        int count = 0;

        while(currentamount < finalamount){
            System.out.println(currentamount+"xyz");
            currentamount = investment+(currentamount*0.12);
            System.out.println(currentamount+"abc");
            count++;
        }
    }
}
