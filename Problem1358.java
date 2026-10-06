class Solution {
    public int numberOfSubstrings(String s) {
        int right = 0;
        int left = 0;
        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while(right < s.length()){
            if(s.charAt(right) == 'a') a++;
            if(s.charAt(right) == 'b') b++;
            if(s.charAt(right) == 'c') c++;

            while(a > 0 && b > 0 && c > 0){
                count = count+(s.length()-right);
                if(s.charAt(left) == 'a') a--;
                if(s.charAt(left) == 'b') b--;
                if(s.charAt(left) == 'c') c--;
                left++;
            }
            right++;
        }
        return count;
    }
}