class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum =0;
        for(int x : nums){
            if(x % 2 == 0){
                sum = sum + x;
            }
        }
        int [] ans = new int[queries.length];
        int index;
        for(int i=0; i<queries.length; i++){
            index = queries[i][1];
            if(nums[index] % 2 == 0){
                sum = sum - nums[index];
            }
            nums[index] =nums[index] + queries[i][0];
            if(nums[index] % 2 == 0){
                sum = sum + nums[index];
            }
            ans[i] = sum;
        }
        return ans;
    }
}