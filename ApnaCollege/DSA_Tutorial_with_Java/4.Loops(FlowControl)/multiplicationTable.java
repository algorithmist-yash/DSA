import java.util.*;

public class multiplicationTable {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.println("The multiplication for the number "+ n + " is : ");
        for(int i = 1; i <= 10; i++){
            System.out.println(n+ " * "+ i+ " = "+ (i*n));
        }
        System.out.println();
        sc.close();
    }    
}
