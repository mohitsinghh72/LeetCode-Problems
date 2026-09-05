class Solution {
    public int longestPalindromeSubseq(String s) {
        String s2 = rev(s);
        int[][] dp = new int[s.length()][s2.length()];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return lcs(s,s2,s.length()-1,s2.length()-1,dp);
    }
    private int lcs(String s1,String s2,int ind1,int ind2,int[][] dp){
        if(ind1 < 0 || ind2 < 0){
            return 0;
        }
        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }
        if(s1.charAt(ind1) == s2.charAt(ind2)){
            return dp[ind1][ind2] = 1+lcs(s1,s2,ind1-1,ind2-1,dp);
        }
        return dp[ind1][ind2] = Math.max(lcs(s1,s2,ind1-1,ind2,dp),lcs(s1,s2,ind1,ind2-1,dp));
    }
    private String rev(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}