package ProgrammingPractice;

public class RandomNumberInGivenRange {
    public static void main(String[] args) {
        int first = 50;
        int last = 100;

        int random = (int)(Math.random()* (last - first +1) + first);
        System.out.println(random);
    }
}
