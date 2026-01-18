class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow!=fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int n){
        int sqre = 0;
        while(n!=0){
            int temp = n%10;
            sqre = sqre + (temp*temp);
            n = n/10;
        }
        return sqre;
    }
}