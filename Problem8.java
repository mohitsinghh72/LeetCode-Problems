class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int i = 0;
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        char sign = '+';
        if(i<s.length() && s.charAt(i) == '-'){
            sign = '-';
            i++;
        }else if(i<s.length() && s.charAt(i) == '+'){
            i++;
        }
        while(i<s.length()){
            char ch = s.charAt(i);

            if(ch < '0' || ch > '9'){
                break;
            }
            int digit = ch - '0';

            if(ans > (Integer.MAX_VALUE - digit)/10){
                if(sign == '-'){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }
            ans = ans*10+digit;
            i++;
        }
        if(sign == '-'){
            return -ans;
        }else{
            return ans;
        }
    }
}