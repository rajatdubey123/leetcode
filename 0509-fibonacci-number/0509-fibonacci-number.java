class Solution {
    public int fib(int n) {
        // int [] dp = new int[n+1];
        // Arrays.fill(dp,-1);
        // if(n == 0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        // if(dp[n] != -1)
        //     return dp[n];
        // return dp[n] = fib(n-1) + fib(n-2);
        int prev2 = 0;
        int prev = 1;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        for(int i=2; i<=n; i++){
            int curr = prev2 + prev;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}