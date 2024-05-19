package Array;

public class CommonElement {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int a [] = {8,45,4,2,21,65,24,70,48};
        int b [] = {2,47,24,8,21,4,64,70,48};
        int c [] = {47,24,1,70,58,21,65,4,54};


        for (int i = 0;i<a.length;i++ ){

            for (int j = 0;j<a.length;j++ ){

                for (int k = 0;k<a.length;k++ ){

                    if(a[i]==b[j] && a[i]==c[k]){
                        System.out.println(a[i]);
                    }
                }
            }
        }
    }
}
