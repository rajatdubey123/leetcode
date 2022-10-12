class Solution {
     static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (target == 0) {
            ans.add(new ArrayList < > (ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    // public void f(int ind, int[] c, int target, List<Integer>temp,List<List<Integer>>ans){
    //         if(target == 0){
    //             ans.add(new ArrayList<>(temp));
    //             return;
    //     }
    //         for(int i = 0; i < c.length; i++){
    //         if(ind > i && c[i] == c[i-1]){
    //             continue;
    //         }
    //         if(c[i] > target){
    //             break;
    //         }
    //         temp.add(c[ind]);
    //         f(ind+1 ,c,target - c[i],temp,ans);
    //         temp.remove(temp.size() -1);
    //     }
    //     f(ind+1,c,target,temp,ans);
    // }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Arrays.sort(c);
        // List<List<Integer>> ans = new ArrayList<>();
        // f(0,c,target,new ArrayList<>(),ans);
        // return ans;
        List < List < Integer >> ans = new ArrayList < > ();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }
}