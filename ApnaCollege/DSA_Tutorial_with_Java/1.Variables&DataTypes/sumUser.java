import java.util.*; // import the required packages to reuse the library

public class sumUser{
    public static void main(String [] args){
        // sc is being a Scanner class object being created to take user inputs from console
        Scanner sc = new Scanner(System.in);
        
        //User input 1st number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // User input 2nd number
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // int sum = a+b;

        System.out.println("The concatenation of two given inputs are "+ a+b); // The output here is ab concatenation of both numbers
        System.out.println("The sum of two given inputs are "+ (a+b));
        
        System.out.println("Enter float value");        
        float f = sc.nextFloat();
        System.out.println(f);

        
        System.out.println("Enter Byte value");
        byte by = sc.nextByte();
        System.out.println(by);

        
        System.out.println("Enter short value");
        short s = sc.nextShort();
        System.out.println(s);

        
        System.out.println("Enter double value");
        double d = sc.nextDouble();
        System.out.println(d);

        
        System.out.println("Enter long value");
        long l = sc.nextLong();
        System.out.println(l);

        System.out.println("Enter boolean value");
        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        System.out.println("Enter string without spacing only !!!");
        String frist_name = sc.next();
        System.out.println(frist_name);
        
        System.out.println("Enter string");
        String st = sc.next();
        System.out.println(st);
        
        System.out.println("Enter string with spaces");
        String full_name = sc.nextLine();
        System.out.println(full_name);

        // Always close Scanner class object sc at the end of the code
        sc.close();
    }
}