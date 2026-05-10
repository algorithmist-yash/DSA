import java.util.*;

public class arrayBasics{
    public static void initailizeArray(int arr[], Scanner sc){
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String [] args){
        // creating array of taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        initailizeArray(arr,sc);      // Array is pass by reference in java in a function call.
        
        printArray(arr);
        sc.close();
    }
}