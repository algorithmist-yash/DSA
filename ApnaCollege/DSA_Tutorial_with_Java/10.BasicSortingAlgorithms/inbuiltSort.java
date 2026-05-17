import java.util.Arrays;

public class inbuiltSort {

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        int arr[] = {5,4,7,2,3,1,5,4,3};
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
    }
}
