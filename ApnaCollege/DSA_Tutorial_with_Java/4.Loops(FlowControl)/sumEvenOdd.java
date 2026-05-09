import java.util.*;

public class sumEvenOdd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of integers you would like to enter: ");
        n = sc.nextInt();

        System.out.println("Enter the set of integers: ");  

        int sumEven = 0;
        int sumOdd = 0;

        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num%2==0){
                sumEven += num;
            }else{
                sumOdd += num;
            }
        }

        System.out.println("The sum of even integers present in the input numbers are: "+ sumEven);
        System.out.println("The sum of odd integers present in the input numbers are: "+ sumOdd);
        sc.close();
    }
}


/*
import java.util.*;

public class SumEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter integers (press any non-number and Enter to stop):");

        while (sc.hasNextInt()) {

            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers = " + evenSum);
        System.out.println("Sum of odd integers = " + oddSum);

        sc.close();
    }
}

*/


/*
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int choice;

        int evenSum = 0;
        int oddSum = 0;

        do {

            System.out.print("Enter the number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        sc.close();
    }
}
*/