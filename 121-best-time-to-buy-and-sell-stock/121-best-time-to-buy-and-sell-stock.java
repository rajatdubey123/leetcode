class Solution {
    public int maxProfit(int[] prices) {
        int M = Integer.MAX_VALUE;
        int N = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<M){
                M = prices[i];
            }else if(prices[i] - M > N)
                N = prices[i] -M;
        }
        return N;
    }
}