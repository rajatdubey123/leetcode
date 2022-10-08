class Solution {
    public int rob(int[] nums) {
        int [] dp = new int[nums.length +1];
        Arrays.fill(dp,-1);
        int i = nums.length -1;
        return f(nums,i,dp);
        
    }
    public int f(int[] nums, int i,int []dp){
        if(i < 0){
            return 0;
        }
        if(dp[i] != -1)
            return dp[i];
         dp[i] = Math.max(f(nums,i-2,dp) + nums[i], f(nums,i-1,dp));
        return dp[i];
    }
}