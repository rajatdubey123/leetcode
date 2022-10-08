class Solution {
    public int integerReplacement(int n) {
        int count = 0;
        if(n == 1){
            return 0;
        }
        if(n%2 == 0){
            count = 1 + integerReplacement(n/2);
        }
        if(n%2 == 1){
            count = 1 + Math.min(integerReplacement(n+1),integerReplacement(n-1));
        }
        return count;
        }
    }