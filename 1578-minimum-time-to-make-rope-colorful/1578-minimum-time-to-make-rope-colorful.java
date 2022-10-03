class Solution {
    public int minCost(String colors, int[] neededTime) {
        int len = neededTime.length;
         int time = 0;
        int max = 0;
        for(int i =0; i<colors.length(); ++i){
            if(i>0 && colors.charAt(i) != colors.charAt(i-1)){
                max =0;
            }
            time = time + Math.min(max,neededTime[i]);
            max = Math.max(max,neededTime[i]);
        }
        return time;
        }
    }