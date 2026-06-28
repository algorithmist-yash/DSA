public class BinaryStringNoConsecutiveOnes {
    
    public static void longestNonconsecutiveOnesString(int n, int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        longestNonconsecutiveOnesString(n-1, 0, str+"0");
        if(lastPlace==0){
            longestNonconsecutiveOnesString(n-1, 1, str+"1");
        }
    }
    public static void main(String [] args){
        longestNonconsecutiveOnesString(3, 0, "");
    }
}
