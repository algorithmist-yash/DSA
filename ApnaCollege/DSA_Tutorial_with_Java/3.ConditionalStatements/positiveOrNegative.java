import java.util.*;

public class positiveOrNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("NUmnebr is neither negative nor positive");
        }

        else{
            String type = (num>0)? "POSITIVE" : "NEGATIVE";
            System.out.println(type);
        }

        sc.close();
    }
}
