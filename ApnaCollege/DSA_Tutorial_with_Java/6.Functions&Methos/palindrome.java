import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int n){
        int rev = 0;
        int num = n;
        while(n>0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n=n/10;
        }

        if(rev==num){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("The number you entered "+ n+ " is a palindrome");
        }else{
            System.out.println("The number you entered is not a palindrome.");
        }
        sc.close();
    }
}
