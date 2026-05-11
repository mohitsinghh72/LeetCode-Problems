class Solution {
    public int differenceOfSums(int n, int m) {
        int sumDivisible = 0;
        int sumNotDivisible = 0;

        int i = 1;

        while(i<=n){
            if(i%m == 0){
                sumDivisible = sumDivisible + i;
            }
            else{
                sumNotDivisible = sumNotDivisible + i;
            }
            i++;
        }
        return sumNotDivisible - sumDivisible;

    }
}