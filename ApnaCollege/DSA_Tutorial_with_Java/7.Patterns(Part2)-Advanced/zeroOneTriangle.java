import java.util.*;

public class zeroOneTriangle {
    public static void zOT(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if((i+j)%2==0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        zOT(rows);
        sc.close();
    }    
}
