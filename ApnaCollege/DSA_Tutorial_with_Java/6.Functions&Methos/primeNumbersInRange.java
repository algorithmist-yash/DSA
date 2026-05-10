import java.util.*;

public class primeNumbersInRange {

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for(int i = 1; i <= n; i++){
            if(isPrime(i)){
                System.out.println(i + " is PRIME.");
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit of the range(INCLUSIVE): ");
        int n = sc.nextInt();

        primeRange(n);

        sc.close();
    }
}
