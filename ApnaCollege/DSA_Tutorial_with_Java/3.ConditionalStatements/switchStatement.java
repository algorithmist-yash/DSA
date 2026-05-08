import java.util.*;

public class switchStatement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two operands");

        System.out.print("Enter A = ");
        int a = sc.nextInt();

        System.out.print("Enter B = ");
        int b = sc.nextInt();


        // Basic arithmetic caluclator for two numbers:
        System.out.print("Select operators only amont +, -, /, *, % : ");
        // char operator = sc.next();      // Tupe mismatch: cannot convert from string to char
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println("Sum of two input numbers is: "+ (a+b));
            break; //break is used other wise switch statement will keep on performing other cases task once got one correct

            case '-' : System.out.println("Difference of two input numbers is: " + (a-b));
            break;

            case '*' : System.out.println("Multiplication of two input numbers is: " + (a*b));
            break;

            case '/' : System.out.println("Division of two numbers is: " + (a/b));
            break;
            
            case '%' : System.out.println("The remainder when 2nd number divides 1st number is: " +(a%b));
            break;

            default: System.out.println("Your selected wrong operator: ");
        
        }

        sc.close();
    }
}
