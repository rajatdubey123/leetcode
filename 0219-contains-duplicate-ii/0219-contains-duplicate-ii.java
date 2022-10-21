class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(mp.get(nums[i]) == null){
            mp.put(nums[i],i);
            }
            else{
                Integer j = mp.get(nums[i]);
                if(i-j <= k)
                    return true;
                mp.put(nums[i],i);
            }
        }
        return false;
    }
}