package Array;

//Create two integer arrays of diff sizes. Create third array with size = size array1 + size array2.
// And add all elements of array1 first then add all elements for array2
public class AddingArray {

    public static void main(String[] args) {
        int [] a = {1,5,7,3};
        int [] b = {14,92,52,84,73};

        int [] c =  new int[a.length + b.length ];

        for(int i = 0 ; i< a.length; i++){
            c[i] = a[i];
        }

        for(int i =0;i< b.length; i++){
            c[a.length+i] = b[i];
        }
        for(int j = 0 ; j< c.length; j++){
            System.out.println(c[j]);
        }

    }
}
