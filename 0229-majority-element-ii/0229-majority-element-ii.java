class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        int count = 0;
        int count2 = 0;
        int len = nums.length;
        for(int i =0; i<len; i++){
            if(nums[i] == num1){
                count++;
            }else if(nums[i] == num2){
                count2++;
            }else if(count == 0){
                num1 = nums[i];
                count =1;
            }else if(count2 == 0){
                num2 = nums[i];
                count2 = 1;
            }else{
                count--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        count = 0;
        count2 = 0;
        for(int j =0; j<len; j++){
            if(nums[j] == num1){
                count++;
            }
            if(nums[j] == num2){
                count2++;
            }
        }
        if(count > len/3){
            ans.add(num1);
        }
        if(count2 > len/3){
            ans.add(num2);
        }
        return ans;
    }
}