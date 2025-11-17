class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = 0;
        for(int i = 0;i<accounts.length;i++){
            int richest = 0;
            for(int j = 0;j<accounts[i].length;j++){
                richest = richest+accounts[i][j];
            }

            if(richest>max){
                max = richest;
            }
        }
        return max;

    }
}