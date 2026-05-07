import java.util.*;

public class typeCasting {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float type decimal: ");
        float f = sc.nextFloat();
        // int a = f;   // error: incompatible types: possible lossy conversion from float to int
        System.out.println("Enter integer type input: ");
        int a = sc.nextInt();
        f = a;
        System.out.println(f);
        sc.close();

        // float flo = 25.12;   //error: incompatible types: possible lossy conversion from float to int
        float flo = 25.12f;
        int b = (int)flo; // from bigger data type to lower // lossy conversion
        System.out.println(b);

    }
}
