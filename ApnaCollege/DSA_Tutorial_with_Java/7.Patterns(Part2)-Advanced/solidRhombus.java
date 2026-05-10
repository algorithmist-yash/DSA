import java.util.*;

public class solidRhombus {
    public static void sR(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print("  ");
            }
            for(int j = 0; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sR(n);

        sc.close();
    }
}
