import java.util.*;

public class typeConversion {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextFloat();    //error: incompatible types: possible lossy conversion from float to int
        float num = sc.nextInt();
        System.out.println(num);    // If i give other type input like float type then, 34.5 Exception in thread "main" java.util.InputMismatchException
        sc.close();
    }
}
