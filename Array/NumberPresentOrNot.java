package Array;

public class NumberPresentOrNot {
    public static void main(String[] args) {
        int arr [] = {2,7,6,4,8,10};
        int a = 24;
        boolean flag = false;

        for (int i = 0 ; i< arr.length; i++){
            if(arr[i] == a){
                flag = true;
            }
        }

        if(flag == true){
            System.out.println(a + " is present in array");
        }
        else {
            System.out.println(a + " is not present in array");
        }
    }
}
