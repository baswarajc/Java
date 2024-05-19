package PatternPrinting;

public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {
        for (int i = 1; i<= 5; i++){
            for (int j = 1; j<= i; j++){
                if(i>=j){
                    System.out.print(j+"  ");
                }
            }
            System.out.println();
        }
    }
}
