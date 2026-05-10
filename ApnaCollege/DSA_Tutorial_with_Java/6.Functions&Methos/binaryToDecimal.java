import java.util.*;

public class binaryToDecimal {
    public static int  bToD(int n){
        int dec=0;
        int i=0;
        while(n > 0){
            int rem = n%10;
            dec += rem*(int)Math.pow(2,i);
            i++;
            n /= 10; 
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number upto 8 bits only (wihtout spacing): ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!='0' && ch!= '1'){
                System.out.println("Enter binary numbers only!!");
                sc.close();
                return;
            }
        }
        System.out.println("The decimal conversion of "+ num +" = " + bToD(num));

        sc.close();
    }
}
