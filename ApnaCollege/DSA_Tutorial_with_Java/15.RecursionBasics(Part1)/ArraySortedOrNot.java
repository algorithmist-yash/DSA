public class ArraySortedOrNot {
    public static void main(String [] args){
        int arr[] = {1,3,5,6,7,8,9};
        if(isSorted(0, arr)){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
    }   
    public static boolean isSorted(int i,int [] arr){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(i+1, arr);
    } 
}
