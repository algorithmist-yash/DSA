public class PrintNumberDecreasing {
    
    public static void printDec(int n){
        //  Base Case
        if(n==1){
            System.out.println(n);
            return;
        }
        //  Things to do
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String [] args){
        printDec(14);
    }
}
