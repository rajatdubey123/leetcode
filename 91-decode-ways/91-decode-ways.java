class Solution {
    public int numDecodings(String s) {
        Map<Integer, Integer> mp = new HashMap<>();
        return count(s,0,mp);
    }
    public int count(String s, int index,Map<Integer,Integer>mp){
         if(mp.containsKey(index)) return mp.get(index);
        int count =0;
        if(index < s.length()){
            int ans1 = Integer.parseInt(s.substring(index,index+1));
            if(ans1 < 1 || ans1 > 26){
                count = count+0;
            }
            else 
                count = count + count(s,index+1,mp);
            if(ans1 != 0 && index + 1 < s.length()){
                int ans2 = Integer.parseInt(s.substring(index, index + 2));
                if(ans2 < 1 || ans2 > 26)  count += 0;
                else count += count(s, index + 2,mp);
            }
            mp.put(index,count);
            return count;
        }
        else
            return 1;
    }
}