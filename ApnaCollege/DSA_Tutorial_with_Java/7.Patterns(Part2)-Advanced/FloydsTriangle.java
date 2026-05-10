import java.util.*;

public class FloydsTriangle {
    public static void fT(int n){
        int count = 1;
        for(int i = 0; i < n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        fT(n);

        sc.close();
    }
}
