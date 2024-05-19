package Array;
import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};

        int arr2 [] = new int[arr.length-1];
        int index = 2;
        for (int i = 0, k = 0; i< arr.length; i++){
            if(index == i){
                continue;
            }
            arr2[k] = arr[i];
            k++;
        }

        System.out.println("old array: "+ Arrays.toString(arr));
        System.out.println("new array: "+ Arrays.toString(arr2));


    }
}
