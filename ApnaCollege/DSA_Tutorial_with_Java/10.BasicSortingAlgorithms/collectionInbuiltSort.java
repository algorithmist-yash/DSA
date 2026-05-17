import java.util.Collections;
import java.util.Arrays;

public class collectionInbuiltSort {
    public static void printArray(Integer arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        // int arr[] = {5,2,4,6,3,4,4,2,9,4,2,3};
        // Arrays.sort(arr,Collections.reverseOrder());        //The method sort(int[]) in the type Arrays is not applicablefor the arguments(int [], Collections.reverseOrder());
        Integer arr2[] = {5,2,4,6,3,4,4,2,9,4,2,3};
        printArray(arr2);
        Arrays.sort(arr2,4,9, Collections.reverseOrder());
        printArray(arr2);
        Arrays.sort(arr2,Collections.reverseOrder());
        printArray(arr2);
    }
}
