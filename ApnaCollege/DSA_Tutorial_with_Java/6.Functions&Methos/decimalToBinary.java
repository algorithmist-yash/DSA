import java.util.*;

public class decimalToBinary {
    public static int dToB(int n){
        int binary = 0;
        int i = 0;
        while(n>0){
            int rem = n%2;
            binary += rem*(int)Math.pow(10,i);
            i++;
            n = n/2;
        }
        return binary;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number uner 255 (inclusive): ");// Better option is to use string to store binary
        int num = sc.nextInt();        
        System.out.println("The binary conversion of "+ num + " is = " + dToB(num));
        
        sc.close();
    }
}
