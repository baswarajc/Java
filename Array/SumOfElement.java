package Array;

public class SumOfElement {
    public static void main(String[] args) {
        double [] arr = {7,84,45,85,12,45};
        double sum = 0 ;
        for (int i = 0 ; i< arr.length; i++){
            sum += arr[i];
        }

        double average = sum/ arr.length ;

        double []  arr2 = {sum, average};

        System.out.println("Sum of all elements in array " + arr2[0]);
        System.out.println("Average of all elements in array " + arr2[1]);
    }
}
