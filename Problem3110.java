class Solution {
    public int scoreOfString(String s) {
        int i = 0;
        int ans = 0;
        while(i+1<s.length()){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(i+1 < s.length()){
                ans = ans+(Math.abs(ch1-ch2));
            }
            i++;
        }
        return ans;
    }
}