package q10935;
import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        int[] ramanujanNumbers = { 1729, 4104, 13832, 20683, 32832 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Printing Ramanujan Numbers: ");
        for(int i=0;i<n;i++){
            System.out.println(ramanujanNumbers[i]);
        }
    }
}