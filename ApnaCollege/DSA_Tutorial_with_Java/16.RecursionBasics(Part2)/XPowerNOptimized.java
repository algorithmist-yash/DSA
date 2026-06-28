import java.util.Scanner;

public class XPowerNOptimized {
    public static int xPowN(int x, int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n%2==0){
            return xPowN(x,n/2)*xPowN(x,n/2);
        }else{
            return x*xPowN(x, n/2)*xPowN(x, n/2);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        System.out.println(x+ " power "+ n +" is = "+xPowN(x,n));
        sc.close();
    }
}
