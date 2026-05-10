import java.util.*;

public class hollowRectangle {
    public static void hRec(int n, int m){

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         if(i == 0|| i == n-1 || j==0 || j== m-1){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<m){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        hRec(n,m);
        sc.close();
    }
}
