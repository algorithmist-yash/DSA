import java.util.Scanner;

public class ClimbingStairsMemoization {
    public static int countForTwoWays(int n, int f[]){
        if(n==0|| n==1){
            return 1;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n] = countForTwoWays(n-1, f) + countForTwoWays(n-2, f);
        return f[n];
    }
    public static int countForThreeWays(int n, int f[]){
        if(n==0|| n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        if(f[n]!=0){
            return f[n];
        }
        f[n] = countForThreeWays(n-1, f) + countForThreeWays(n-2, f) + countForThreeWays(n-3, f);
        return f[n];
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term to get fibonacci term: ");
        int n = sc.nextInt();
        int f [] = new int [n+1];
        System.out.println("Ways to climb for max 2 steps " + n+ " stairs is: "+ countForTwoWays(n,f));
        int f2[] = new int [n+1];
        System.out.println("Ways to climb for max 3 steps " + n+ " stairs is: "+ countForThreeWays(n,f2));
        sc.close();
    }
}
