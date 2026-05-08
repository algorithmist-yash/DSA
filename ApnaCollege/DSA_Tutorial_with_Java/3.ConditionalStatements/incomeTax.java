import java.util.*;

public class incomeTax {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your income: ");
        float income = sc.nextFloat();
        float tax=0f;

        if(income < 5e5){
            System.out.println("NO TAX");
        }else if( income < 1e6){
            System.out.println(" 20 % TAX");
            tax = 0.2f*income;
        }else{
            System.out.println("30 % TAX");
            tax = 0.3f*income;
        }

        System.out.println("Your earning after deduction of TAX: "+ (income-tax)+ " with tax paid "+ tax);

        sc.close();
    }
}
