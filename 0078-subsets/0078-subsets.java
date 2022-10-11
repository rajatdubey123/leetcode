class Solution {
    List<List<Integer>> ans;
    void f(int i,List<Integer> temp, int[] nums){
        if(i == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        f(i+1,temp,nums);
        temp.remove(temp.size()-1);
        f(i+1,temp,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        f(0,new ArrayList<Integer>(),nums);
        return ans;
    }
}