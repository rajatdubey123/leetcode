class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>ans = new ArrayList<>();
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end && end-start+1 > k){
            int a = Math.abs(arr[start]-x);
            int b = Math.abs(arr[end]-x);
            if(a>b){
                start++;
            }else{
                end--;
            }
        }        
        for(int i=start;i<=end;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}