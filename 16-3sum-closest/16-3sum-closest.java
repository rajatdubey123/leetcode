class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int close;  
        int temp=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
             int left=i+1;
             int right= nums.length-1;
            while(left<right){
                close=target-nums[i]-nums[left]-nums[right];
                if(close==0)
                    return target-close; 
                if(Math.abs(temp)>Math.abs(close))
                    temp=close;
                if(close>0)
                    left++;
                else
                    right--;
            }
        }
        return target-temp;
    }
}