package Array;

public class Multiple {
    public static void main(String[] args) {
        int arr [] = {2,7,6,4,8,10};

        int multi = 1;
        for (int i = 0 ; i< arr.length; i++){
            multi = multi * arr[i];
        }
        System.out.println(multi);
    }
}
