package loop;

public class SumOfTableNumbers {
    public static void main(String[] args) {
        int n = 8;
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += (n * i);
            i++;
        }
        System.out.println(sum);
    }
}
