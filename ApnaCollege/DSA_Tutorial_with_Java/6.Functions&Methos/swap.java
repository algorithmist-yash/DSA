public class swap {

    public static void swaP(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swap in swap funciton: "+ a + " " +b);
    }
    public static void main(String args[]){
        int a = 5;
        int b = 2;

        swaP(a,b);
        System.out.println("Call by value so swap not happen in main function: "+a + " " + b);
    }
}
