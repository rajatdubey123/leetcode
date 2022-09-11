class Solution {
    public int myAtoi(String s) {
        long result =0;
        String num = s.trim();
        
        if(num.length() == 0){
            return 0;
        }
        long sign = 1;
        int i =0;
        if(num.charAt(0) == '-'){
            sign = -1;
            i++;
        }
        if(num.charAt(0) == '+'){
            i++;
        }
        while(i<num.length() && Character.isDigit(num.charAt(i))){
            long temp = (long)Character.getNumericValue(num.charAt(i));
            result = result*10 + sign*temp;
            
 if((sign == -1 && result < Integer.MIN_VALUE) || (sign == 1 && result > Integer.MAX_VALUE)){
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;

        }
        return (int)result;
    }
}