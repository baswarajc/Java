package string;

public class InsertStringInString {

    public static void main(String[] args) {

        String original = "Vikas is a student";

        String add1 = "bright";
        String add2 =  "dull";

        String result = "";

        for(int i = 0 ; i <original.length(); i++){
            result += original.charAt(i);
            if (i == 10){
                result = result + add1 + " ";
            }
        }

        System.out.println(result);
    }
}
