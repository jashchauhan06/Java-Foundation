package q10946;
import java.util.*;
public class MultiDimArrayPrinter {
    public static void main(String[] args) {
        int[][] int2DAr =
        {
            {1},
            {2, 3},
            {4, 5, 6},
            {7, 8, 9, 10}
        };

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < i; j++){
                if(int2DAr[i][j] < n){
                    System.out.print(int2DAr[i][j] + " ");
                }
            }
        }
    }
}