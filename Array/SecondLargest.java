package Array;

//Create two integer arrays of diff sizes. Create third array with size = size array1 + size array2.
// And add all elements of array1 first then add all elements for array2

public class SecondLargest {
    public static void main(String[] args) {
        int ar [] = {2,4,8,25,21,14,40};

        for (int i = 0 ; i < ar.length-1 ; i++){
            if (ar[i]> ar[i+1]) {
                int temp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = temp;
            }
        }

        System.out.println(ar[ar.length-2]);

    }
}
