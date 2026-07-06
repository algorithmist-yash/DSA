public class ClimbingStairsTabulation {
    public static int countTwoWays(int n){
        int dp[] = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static int countThreeWays(int n){
        int dp[] = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n = 5;
        int ans = countTwoWays(n);
        int ans2 = countThreeWays(n);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
