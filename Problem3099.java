class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = sum(x);

        if(x%sum == 0){
            return sum;
        }else{
            return -1;
        }

    }
    public int sum(int x){
        int sum = 0;

        while(x>0){
            sum = sum + x%10;
            x = x/10;
        }
        return sum;

    }
}