class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int sum = 0;
        int richest = 0;
        for(int i = 0; i<m; i++){
            for(int j=0; j<accounts[i].length; j++){
               sum = sum + accounts[i][j];
                }
            richest = Math.max(richest,sum);
            sum =0;
            }
        return richest;
    }
}