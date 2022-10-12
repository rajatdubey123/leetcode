class Solution {
    public void f(int ind, int[] candidates, int target, List<Integer> temp,List<List<Integer>> ans){
        if(ind == candidates.length){
            if(target == 0){
            ans.add(new ArrayList<>(temp));
        }
            return;
        }
        if(candidates[ind] <= target){
            temp.add(candidates[ind]);
            f(ind,candidates,target-candidates[ind],temp,ans);
            temp.remove(temp.size() -1);
        }
        f(ind +1,candidates,target,temp,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        f(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}