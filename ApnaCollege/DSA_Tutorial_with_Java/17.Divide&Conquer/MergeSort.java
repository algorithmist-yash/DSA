public class MergeSort {
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void merge(int si, int mid, int ei,int arr[]){
        int [] temp = new int [ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        // merging arrays left and right
        while(i<=mid && j<=ei){
            if(arr[i] <arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        // left part left if any
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // right part left if any
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void mergeSort(int si, int ei,int arr[]){
        if(si>=ei){
            return;
        }
        
        // Dividing array
        int mid = si + (ei - si)/2;

        // left part
        mergeSort(si, mid, arr);
        // right part
        mergeSort(mid+1, ei, arr);

        //merging function call
        merge(si,mid,ei,arr);
    }
    public static void main(String [] args){
        int arr[] = {6,3,9,5,2,15,8};
        int si = 0;
        int ei = arr.length-1;
        mergeSort(si,ei,arr);
        printArray(arr);
    }
}
