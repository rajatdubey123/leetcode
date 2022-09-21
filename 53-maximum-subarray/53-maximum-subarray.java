class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = Integer.MIN_VALUE;
        int s = 0;
        for(int i=0; i<nums.length; i++){
            s = s+ nums[i];
            if(s>sum){
                sum = s;
            }
            if(s<0){
                s =0;
            }
        }
        return sum;
    }
}