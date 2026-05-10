public class binomialCoefficient {

    public static int fac(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    
    public static int binomiaCoeff(int n, int r){
        int n_fact = fac(n);
        int r_fact = fac(r);
        int nmr_fact = fac(n-r);
        return n_fact / (r_fact * nmr_fact);
    }
    public static void main(String args[]){
        int n = 10;
        int r = 5;
        int bc = binomiaCoeff(n,r);
        System.out.println("The binomial coefficient of : n = "+ n + " and r = "+r + " is : "+ bc);
    }
}
