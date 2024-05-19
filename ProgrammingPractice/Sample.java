package ProgrammingPractice;

public class Sample {
    public static void main(String[] one) {
        int a [] = {1,2,3,4,5,10,11,12};
        int b [] = {2,3,4,5,6,12,13,11};
        int c [] = {3,4,5,6,7,14,11,36};


        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++ ){
                for (int k = 0; k < c.length; k++ ){
                    if (a[i] == b [j] && a[i] == c[k]){
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}
