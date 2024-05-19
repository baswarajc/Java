package ProgrammingPractice.String;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String s = "i love programming very much";
        String [] arr = s.split(" ");

        String result = "";

        for (int i=(arr.length-1); i >=0 ; i--){
            if (i==0)
                result += arr[i];
            else
                result += arr[i]+" ";
        }

        System.out.println(result);
    }
}
