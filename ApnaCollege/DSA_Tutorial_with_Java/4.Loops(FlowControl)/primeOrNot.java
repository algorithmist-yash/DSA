import java.util.*;

public class primeOrNot {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println("NEITHER PRIME NOR COMPOSITE");
            sc.close();
            return;
        }

        // Math.sqrt() returns a double type

        for(int i = 2; i<=(int)Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println("NOT PRIME!! COMPOSTITE");

                sc.close();
                return;
            }
        }

        System.out.println("PRIME");

        sc.close();
    }
}
