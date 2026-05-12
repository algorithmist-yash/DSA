import java.util.*;

public class pairsInArray {
    public static void pairs(int arr[]){
        int pairs=0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j]+ ")");
                System.out.print(", ");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("The number of pairs in the arrays are : "+ pairs);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};
        pairs(arr);

        sc.close();
    }
}
