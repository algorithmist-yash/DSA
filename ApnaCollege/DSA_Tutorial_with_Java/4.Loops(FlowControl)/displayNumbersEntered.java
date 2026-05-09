import java.util.*;

public class displayNumbersEntered {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you would like to enter : ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            int n = sc.nextInt();
            if(n%10 != 0){
                System.out.print(n+ " ");
            }
        }

        sc.close();
    }
}
