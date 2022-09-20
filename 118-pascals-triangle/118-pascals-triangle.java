class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        sub.add(1);
        list.add(sub);
        for(int i = 1;i< numRows; i++){
            List<Integer> temp = new ArrayList<>();
            int val = 1;
            temp.add(val);
            for(int j = 0;j<i ;j++){
                int val2 = val*(i-j)/(j+1);
                temp.add(val2);
                val=val2;
            }
            list.add(temp);
        }
        return list;
    }
}