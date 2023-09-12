package string;

public class PrintEvenLengthWordInString {
    public static void main(String[] args) {
        String s = "Java program to print Even length words in a String";

        String [] arr = s.split(" ");

        for (int i = 0; i< arr.length ; i++){
            if (arr[i].length() %2 == 0){
                System.out.println(arr[i]);
            }
        }

    }
}
