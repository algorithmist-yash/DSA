public class SumOfNNaturalNumbers {
    public static int sumTill(int n){
        //  Base case
        if(n==1){
            return 1;
        }
        return n+sumTill(n-1);
    }
    public static void main(String [] args){
        System.out.println(sumTill(15));
    }
}
