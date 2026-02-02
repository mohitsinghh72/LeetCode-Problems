class Solution {
    public int subtractProductAndSum(int n) {
        int multiply = product(n);
        int addition = sum(n);

        return multiply-addition;

    }

    private int sum(int n){
        int add = 0;

        while(n>0){
            int rem = n%10;
            add = add + rem;
            n = n/10;
        }
        return add;
    }

    private int product(int n){
        int pro = 1;
        while(n>0){
            int rem = n%10;
            pro = pro*rem;
            n= n/10;
        }
        return pro;
    }
}