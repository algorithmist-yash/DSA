import java.util.*;

public class linearSearch {
    public static int lSearch(int [] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        initailizeArray(arr,sc);      // Array is pass by reference in java in a function call.
        printArray(arr);
        
        System.out.print("\nEnter the key you would like to search: ");
        int key = sc.nextInt();
        if(lSearch(arr, key) == -1){
            System.out.println("The element was not present in the array!!!");
        }else{
            System.out.println("The is found to be at index :"+lSearch(arr, key));
        }

        sc.close();
    }
}
