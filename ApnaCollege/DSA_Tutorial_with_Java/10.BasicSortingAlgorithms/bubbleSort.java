public class bubbleSort{

    public static void bubble(int arr[]){
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Optimize for Sorted Array....


    
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int arr[] = { 7,5,6,3,9,20,33,2,4,1,3,3};
        bubble(arr);
        printArray(arr);
    }
}