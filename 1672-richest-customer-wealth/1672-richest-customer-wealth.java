class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max1= Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int sum =0;
            for(int j =0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            max1 = Math.max(max1,sum);
        }
        return max1;
    }
}