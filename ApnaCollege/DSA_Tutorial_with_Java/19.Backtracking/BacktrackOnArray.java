public class BacktrackOnArray {
    public static void changeArr(int arr[], int si, int val){
        // Base case
        if(si==arr.length){
            printArray(arr);
            return;
        }

        // Assigning value to the index of array
        arr[si] = val;
        // recursion call
        changeArr(arr, si+1, val+1);
        
        // Bactracking Step
        arr[si] -= 2;
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = new int [5];
        changeArr(arr,0,1);
        printArray(arr);
    }    
}
