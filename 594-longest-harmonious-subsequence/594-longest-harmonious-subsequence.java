class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        int j =1;
        int result =0;
        while(j<nums.length){
            int diff = nums[j] - nums[i];
            if(diff == 1){
                result = Math.max(result, j-i+1);
            }
            if(diff<=1){
                j++;
            }
            else{
                i++;
            }
        }
        return result;
    }
}