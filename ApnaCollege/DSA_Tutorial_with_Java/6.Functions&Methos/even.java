import java.util.*;

public class even {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("The number you entered is EVEN");
        }else{
            System.out.println("The number you entered is NOT EVEN");
        }



        sc.close();
    
    }
}
