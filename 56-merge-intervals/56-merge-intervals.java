class Solution {
    public int[][] merge(int[][] intervals) {
       
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
       
        int st = intervals[0][0];
        int end = intervals[0][1];
       
        for(int[] it : intervals){
            if(it[0] <= end){
                end = Math.max(it[1],end);
            } else {
                res.add(new int[]{st,end});
                st = it[0];
                end = it[1];
            }
        }
        res.add(new int[]{st,end});
        return res.toArray(new int[0][]);
    }
}