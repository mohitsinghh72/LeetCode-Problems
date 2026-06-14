class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int i = 1;
        while(n >= i){
            count = count+1;
            n = n-i;
            i++;
        }
        return count;

    }
}