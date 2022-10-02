// class Solution {
//     int [] dp;
//     public int ways(int n, int k, int target, int[] dp){
//         int ans = 0;  
//         if(target == 0 && n == 0){
//             return 1;
//         }
//         if(target<n && n*k<target){
//             return 0;
//         }
//         if(n == 1){
//             return 1;
//         }
//         if(dp[n] != 0) return dp[n];
//         for(int i =1; i<=k; i++){
//             if(target < i)
//                 break;
//           ans = ((ans + ways(n-1,k,target-i,dp))% 1000000007)%1000000007; 
//         }
//         return dp[n] = ans;
//     }
//     public int numRollsToTarget(int n, int k, int target) {
//         // int [] dp = new int[n+1];
//         // Arrays.fill(dp,0);
//         dp = new int[n+1];
//         int  way = ways(n,k,target,dp);
//         return way;
//     }
// }
class Solution {
    int[][] dp;
    int MOD = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        if (n == 0 && target == 0) 
            return 1;
        if (target < n || n * k < target) 
            return 0;
        dp = new int[n + 1][target + 1];
        return numRollsToTargets(n, k, target);
    }
    public int numRollsToTargets(int n, int k, int target) {
        if (n == 0 && target == 0) 
            return 1;
        if (target < n || n * k < target) 
            return 0;
        if (dp[n][target] != 0) 
            return dp[n][target];
            int res = 0;
        for (int i = 1; i <= k; i++) {
            if (target < i) break;
                res = (res + numRollsToTargets(n - 1, k, target - i) % MOD) % MOD;
        }
        dp[n][target] = res;
        return res;
    }
}