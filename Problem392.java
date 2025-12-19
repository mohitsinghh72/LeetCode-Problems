class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }

        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if(ch1 == ch2){
                i++;
                j++;
            }else{
                j++;
            }
            if(i == s.length()){
                return true;
            }
        }
        return false;
    }
}