public class NthFibonacci {
    public static int fib(int n){
        //   Base case 0
        if(n==0 || n==1){
            return n;
        }
        //  Things to do and recusion call
        //  int fibonacci = fib(n-1)+ fib(n-2);
        //  return fibonacci;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String [] args){
        System.out.println(fib(2));
    }
}
