class Solution {
    public boolean checkGoodInteger(int n) {
        int sqsum = squaresum(n);
        int digsum = digitSum(n);

        if(sqsum-digsum >= 50){
            return true;
        }else{
            return false;
        }
    }
    private int squaresum(int n){
        int ans = 0;
        while(n>0){
            ans += (int)(Math.pow(n%10,2));
            n = n/10;
        }
        return ans;
    }
    private int digitSum(int n){
        int ans = 0;
        while(n>0){
            ans += n%10;
            n = n/10;
        }
        return ans;
    }
}