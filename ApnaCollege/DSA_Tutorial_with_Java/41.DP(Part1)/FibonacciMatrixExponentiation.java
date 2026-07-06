public class FibonacciMatrixExponentiation{

    static long MOD = 1000000007;
    
    public static long [][] multiply(long [][] A, long [][] B){
        int n = A.length;
        long [][] C = new long[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }
    public static long [][] power(long [][]A, long n){
        int size = A.length;
        long [][] result = new long[size][size];

        for(int i = 0; i < size; i++){
            result[i][i] = 1;
        }
        while(n>0){
            if((n&1) == 1){
                result = multiply(result, A);
            }
            A = multiply(A,A);
            n >>= 1;
        }
        return result;
    }
    public static long fib(long n){
        if(n == 0){
            return 0;
        }
        long [][] M = {
            {1,1},
            {1,0}
        };
        long [][] Mn = power(M, n-1);
        return Mn[0][0];
    }
    public static void main(String [] args){
        long n = 10;
        System.out.println(fib(n));
    }
}