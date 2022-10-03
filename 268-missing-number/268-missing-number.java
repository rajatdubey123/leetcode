class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int index = 0;
        int [] helper = new int[n+1];
        Arrays.fill(helper,0);
        for(int i =0; i<nums.length; i++){
            helper[nums[i]] = 1;
        }
        for(int i =0; i<helper.length; i++){
            if(helper[i] == 0){
                index = i;
            }
        }
        return index;
    }
}