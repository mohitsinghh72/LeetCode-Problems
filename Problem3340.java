class Solution {
    public boolean isBalanced(String num) {
        int even = 0;
        int odd = 0;

        int i = 0;
        int j = 1;
        while(i<num.length()){
            even = even+(num.charAt(i)-'0');
            i =i+2;
        }
        while(j<num.length()){
            odd = odd + (num.charAt(j)-'0');
            j = j+2;
        }
        if(even == odd){
            return true;
        }
        else{
            return false;
        }

    }
}