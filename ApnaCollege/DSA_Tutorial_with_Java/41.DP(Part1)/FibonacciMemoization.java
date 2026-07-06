import java.util.Scanner;

public class FibonacciMemoization {
    public static int fib(int n, int f[]){
        if(n == 0|| n==1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = fib(n-1, f) + fib(n-2,f);
        return f[n];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term to get fibonacci number : ");
        int n = sc.nextInt();
        int f[] = new int [n+1];
        int nthFib = fib(n,f);
        System.out.println("The "+ n+" th term of fibonacci is :"+ nthFib);
        sc.close();
    }
}
