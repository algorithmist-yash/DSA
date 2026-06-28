public class LastOccurence {
    public static int lo(int []arr,int n,int key){
        if(n < 0){
            return -1;
        }
        if(arr[n]==key){
            return n;
        }
        return lo(arr, n-1, key);
    }

    public static int lastOccur(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccur(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        int n = arr.length;
        System.out.println("The last occurence of the key: "+ key + " is : "+ lo(arr,n-1,key));
        System.out.println("The last occurence of the key: "+ key + " is : "+ lastOccur(arr,key,0));
    }
}
