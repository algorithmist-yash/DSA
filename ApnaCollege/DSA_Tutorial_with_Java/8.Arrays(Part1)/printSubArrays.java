import java.util.*;

public class printSubArrays {
    public static void subArray(int [] arr){
        int subarrays = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                System.out.print("(");
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+",");
                }
                System.out.print(")");
                subarrays++;
            }
            System.out.println();
        }
        System.out.println("Total sub arrays are: "+ subarrays);
    }
    public static int maxSubArraySum(int arr[]){
        if(arr.length==0){
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int currSum = 0;
                for(int k = i; k<=j; k++){
                    if(i==k){
                        currSum += arr[i];
                        if(maxSum<currSum){
                            maxSum=currSum;
                        }
                        continue;
                    }
                    currSum +=arr[k];
                    if(maxSum<currSum){
                        maxSum=currSum;
                    }
                }

            }
        }
        return maxSum;
    }
    public static int minSubArraySum(int arr[]){
        if(arr.length==0){
            return 0;
        }
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int currSum = 0;
                for(int k = i; k<=j; k++){
                    if(i==k){
                        currSum += arr[i];
                        if(minSum>currSum){
                            minSum=currSum;
                        }
                        continue;
                    }
                    currSum +=arr[k];
                    if(minSum>currSum){
                        minSum=currSum;
                    }
                }

            }
        }
        return minSum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,10};
        subArray(arr);
        System.out.println("Maximum sum of the subarrys are: "+ maxSubArraySum(arr));
        System.out.println("Minimum sum of the subarrys are: "+ minSubArraySum(arr));
        sc.close();
    }
}
