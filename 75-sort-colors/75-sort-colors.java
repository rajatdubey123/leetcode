class Solution {
    public void sortColors(int[] nums) {
        // for(int i= 0; i<nums.length-2; i++){
        //     for(int j = i+1; j<nums.length-1; j++){
        //         if(nums[i] > nums[j]){
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //         else
        //             j++;
        //     }
        // }
        // return;
        int r =0;
        int w =0;
        int b =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0)
                r++;
            if(nums[i] == 1)
                w++;
            if(nums[i] == 2)
                b++;
        }
        int i =0;
        while(r--> 0)
            nums[i++] = 0;
        while(w-->0)
            nums[i++] = 1;
        while(b-->0)
            nums[i++] = 2;
    }
}