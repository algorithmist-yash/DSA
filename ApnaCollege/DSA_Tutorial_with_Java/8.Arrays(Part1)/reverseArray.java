import java.util.*;

public class reverseArray {
    public static void reverse(int arr[]){
        int si = 0;
        int ei = arr.length-1;
        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void print(int [] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};
        reverse(arr);
        print(arr);
        sc.close();
    }
}
