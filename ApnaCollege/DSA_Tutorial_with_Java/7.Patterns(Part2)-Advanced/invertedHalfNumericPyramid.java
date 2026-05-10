import java.util.*;

public class invertedHalfNumericPyramid {
    public static void iHNP(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        iHNP(rows);
        sc.close();
    }
}
