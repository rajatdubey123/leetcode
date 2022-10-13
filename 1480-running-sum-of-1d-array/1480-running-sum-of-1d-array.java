class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int sum = 0;
        for(int i =0; i<ans.length; i++){
            ans[i] = sum + nums[i];
            sum = ans[i];
        }
        return ans;
    }
}