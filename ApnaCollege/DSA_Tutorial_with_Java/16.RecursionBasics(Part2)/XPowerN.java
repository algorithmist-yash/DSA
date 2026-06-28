import java.util.*;

public class XPowerN {
    public static int xPowN(int x, int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        return x*xPowN(x,n-1);
    }

    public static double xPowNegativeN(int x, int n){
        if(n==0){
            return 1;
        }
        return (1/(double)x)*xPowNegativeN(x, n+1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        if(n>0){
            System.out.println(x+ " power "+ n +" is = "+xPowN(x,n));
        }else{
            System.out.println(x+ " power "+ n +" is = "+xPowNegativeN(x,n));
        }
        
        sc.close();
    }
}
