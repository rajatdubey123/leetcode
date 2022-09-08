class Solution {
    public int maxProfit(int[] prices) {
        int a = Integer.MAX_VALUE;
        int b =0;
        int c =0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<a){
                a = prices[i];
            }
            b = prices[i] - a;
            if(c<b){
                c = b;
            }
        }
        return c;
    }
}