package string;

public class SwappingPairsOfCharactersInString {
    public static void main(String[] args) {

        String s = "Friendship";
        char [] arr = s.toCharArray();
        for(int i = 0; i<(arr.length-1) ; i++){

            char temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] =temp;
            i++;
        }

        String s1 = new String(arr);
        System.out.println(s1);
    }

}
