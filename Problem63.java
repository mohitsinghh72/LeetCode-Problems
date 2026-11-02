class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return count(obstacleGrid,obstacleGrid.length-1,obstacleGrid[0].length-1,dp);
    }
    private int count(int[][] mat,int r,int c,int[][] dp){
        if(r < 0 || c < 0){
            return 0;
        }
        if(mat[r][c] == 1){
            return 0;
        }
        if(r == 0 && c == 0){
            return 1;
        }
        if(dp[r][c] != -1){
            return dp[r][c];
        }
        int up = count(mat,r-1,c,dp);
        int left = count(mat,r,c-1,dp);
        return dp[r][c] = up+left;
    }
}