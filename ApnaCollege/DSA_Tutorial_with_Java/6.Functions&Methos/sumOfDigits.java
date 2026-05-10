import java.util.*;

public class sumOfDigits {
    public static int digitSum(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }

        return sum;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        int sod = digitSum(n);
        System.out.println("The sum of all the digits you entered is : "+ sod);

        sc.close();
    }
    
}
