package Array;

// Create two integer arrays of same sizes. Create third array
// do summation of respective indices from both the arrays.
//Ex: array1={1,2,3} array2={4,5,6} then array3={5,7,9}

public class SumOfArrayIndices {

    public static void main(String[] args) {
        int [] array1 = {10,12,3};
        int [] array2 = {11,42,13};

        int [] array3 = new int[array1.length ];

        for (int i = 0 ; i< array1.length; i++){
            array3[i] = array1[i] + array2[i];
            System.out.println(array3[i]);
        }

    }
}
