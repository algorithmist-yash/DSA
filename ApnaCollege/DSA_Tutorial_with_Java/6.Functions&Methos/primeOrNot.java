import java.util.*;

public class primeOrNot {

    public static boolean isPrime(int n){
        if((n == 0) || (n==1)){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Enter positive numbers only");
            sc.close();
            return;
        }
        boolean bool = isPrime(n);
        if(bool==true){
            System.out.println("PRIME");
        }else{
            System.out.println("NOT PRIME");
        }
        sc.close();
    }
}
