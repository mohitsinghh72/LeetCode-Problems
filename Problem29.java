class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor){
            return 1;
        }
        boolean sign = true;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(dividend >= 0 && divisor < 0){
            sign = false;
        }
        if(dividend < 0 && divisor >0){
            sign = false;
        }

        int n = dividend;
        int d = divisor;
        if (n > 0) {
            n = -n;
        }

        if (d > 0) {
            d = -d;
        }
        int ans = 0;
        while(n <= d){
            int count = 0;
            int temp = d;
            while (temp >= (Integer.MIN_VALUE >> 1)
                    && n <= (temp << 1)) {

                temp = temp << 1;
                count++;
            }
            ans = ans+(1<<count);
            n = n-(d<<count);

        }
        return sign ? ans : -ans;

    }
}