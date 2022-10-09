class Solution {
    public double myPow(double x, int n) {
        double ans = x;
        return pow(x,n);
    }
    public double pow(double x, int n){
        if(n == 0){
            return 1;
        }    
        if(n < 0){
            return 1/x*pow(1/x,-(n+1));
        }
        return (n%2==0) ? pow(x*x,n/2) : x*pow(x*x,n/2);
    }
}