import java.util.*;

public class helloWorld {

    public static void print_hw(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("Hello World ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of times you would like to print Hello World: ");

        int n = sc.nextInt();

        print_hw(n);

        sc.close();
    }
}