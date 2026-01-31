class Solution {
    public boolean checkPerfectNumber(int num) {
        int i = 1;
        int Original = num;
        int sum = 0;
        while(i<num){
            if(num%i == 0){
                sum = sum+i;
                i++;
            }else{
                i++;
            }
        }
        if(sum == Original){
            return true;
        }else{
            return false;
        }
    }
}