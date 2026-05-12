public class maximumSubarraySum_Brute_Force {
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
    public static void main(String [] args){
        int arr[] = {1,-2, 6,-1, 3};
        System.out.println("Maximum subarray sum is: "+maxSubArraySum(arr));
    }
}
