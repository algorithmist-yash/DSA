import java.util.*;

public class userInputMultipleOfTen {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.print("Enter numbers: ");
        
        do{
            num = sc.nextInt();
        }while((num % 10) != 0);

        System.out.println("You have entered a number which is multiple of 10.");
        sc.close();
    }    
}
