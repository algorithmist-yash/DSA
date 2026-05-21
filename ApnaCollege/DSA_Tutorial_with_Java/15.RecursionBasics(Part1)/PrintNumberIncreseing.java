public class PrintNumberIncreseing {
    public static void printInc(int n){
        // Base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        // Recursive function
        printInc(n-1);

        // Print number which is our job
        System.out.print(n + " ");
    }
    public static void main(String [] args){
        printInc(15);
    }
}
