class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        Integer[][] memo = new Integer[1001][1001];
        return dp(memo,nums,multipliers,0,0);
    }
    
    int dp(Integer[][] memo,int[]nums, int[] multipliers,int left,int op){
        
        int n= nums.length;
        int m = multipliers.length;
        if(op == m){
            return 0;
        }
        if(memo[op][left] != null){
            return memo[op][left];
        }
        int l = nums[left] * multipliers[op] + dp(memo,nums,multipliers,left+1,op+1);
        int r = nums[(n-1)-(op-left)] * multipliers[op] + dp(memo,nums,multipliers,left,op+1);
        
        return memo[op][left] = Math.max(l,r);
    }
}
// class Solution {
//     int n, m;
//     Integer[][] dp;
//     public int maximumScore(int[] nums, int[] multipliers) {
//         n = nums.length;
//         m = multipliers.length;        
        
//         dp = new Integer[1001][1001];
//         return helper(0, 0, nums, multipliers);
//     }
    
//     private int helper(int i, int j, int[] nums, int[] mul) {
//         if( i== m )return 0;
//         if( dp[i][j] != null ) return dp[i][j]; 
//         var left= mul[i]*nums[j] + helper(i+1, j+1, nums, mul);        
//         var right = mul[i]*nums[n-1 -(i-j)] + helper(i+1, j, nums, mul);
//         return dp[i][j] = Math.max(left, right);
//     }
// }