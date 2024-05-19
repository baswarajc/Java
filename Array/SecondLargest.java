package Array;

//Create two integer arrays of diff sizes. Create third array with size = size array1 + size array2.
// And add all elements of array1 first then add all elements for array2

public class SecondLargest {
    public static void main(String[] args) {
        int ar [] = {2,4,28,75,8,25,21,14,40};

        for (int i = 0 ; i < ar.length ; i++){
            for(int j = i+1; j < ar.length ; j++){
                if(ar[i]>ar[j]){
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }

        for (int i = 0 ; i < ar.length; i++){
            System.out.println(ar[i]);

        }

//        System.out.println(ar[ar.length-2]);

    }
}
