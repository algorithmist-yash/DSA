import java.util.*;

public class leapYear {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year of your choice: ");
        int year = sc.nextInt();

        boolean LeapYear = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    LeapYear= true;
                    
                }
            }else{
                LeapYear=true;
            }
        }

        if(LeapYear){
            System.out.println("The year you enter is a LEAP YEAR ");
        }else{
            System.out.println("The year you entered was NOT A LEAP YEAR");
        }

        sc.close();
    }
}
