public class FirstOccurance {
    public static int fo(int key, int [] arr, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fo(key,arr,i+1);
    }
    public static void main(String [] args){
        int arr[] = {1,3,5,6,7,7,8,9};
        int key = 7;
        System.out.println("The first occurrence of "+ key +" is : "+fo(key,arr,0));
    }
}
