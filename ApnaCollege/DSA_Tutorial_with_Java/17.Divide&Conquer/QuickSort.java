public class QuickSort {
    public static void quickSort(int si, int ei,int arr[]){
        
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(si, pIdx-1, arr);
        quickSort(pIdx+1, ei, arr);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;   // to make place for element smaller than pivot

        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];   // pivot = arr[i]
        arr[i] = temp;
        return i;
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = {6,3,9,8,2,5,-2};
        quickSort(0, arr.length-1, arr);
        printArray(arr);
    }    
}
