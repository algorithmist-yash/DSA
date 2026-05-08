import java.util.*;

public class ternaryOperator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();
        
        // TERNARY OPERATOR INSTEAD IF IFELSE:
        // Nested Ternary operator.
        String result = (marks < 33.33f) ? "FAIL" : ((marks>90) ? "PASS WITH DISTINCITON" : "PASS");
        System.out.println(result);

        // int larger = (5>3)? 5:3;
        // System.out.println(larger);

        // String type = (5%2 ==0) ? "EVEN" : "ODD";
        // System.out.println(type);

        sc.close();
    }
}
