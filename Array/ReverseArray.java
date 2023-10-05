package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr [] = {2,7,6,4,8,10};

        for (int i = 0 ; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        for (int i = 0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
