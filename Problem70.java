class Solution {
    public int climbStairs(int n) {
        return climbStairs(n,new int[n+1]);

    }
    public int climbStairs(int n,int[] qb){
        if(n == 0){
            return 1;
        }else if (n<0){
            return 0;
        }
        if(qb[n] > 0){
            return qb[n];
        }

        int nm1 = climbStairs(n-1,qb);
        int nm2 = climbStairs(n-2,qb);

        int total = nm1+nm2;
        qb[n] = total;
        return total;
    }
}