import java.util.*;

public class whileLoopDemonstration{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of times you need to print Hello World");
        int count = sc.nextInt();
        int n= count;
        while(n>0){ // n>0 return True then inside code runs otherwise ignored.
            System.out.print((count - n+1) + ": Hello World ");
            n--;
        }

        sc.close();
    }
}