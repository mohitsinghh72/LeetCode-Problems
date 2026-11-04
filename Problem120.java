class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        boolean[][] visited = new boolean[triangle.size()][triangle.get(triangle.size()-1).size()];

        return count(triangle,0,0,dp,visited);

    }
    private int count(List<List<Integer>> triangle,int r,int c,int[][] dp,boolean[][] visited){
        if(r == triangle.size()-1){
            return triangle.get(r).get(c);
        }
        if(visited[r][c]){
            return dp[r][c];
        }

        int down = triangle.get(r).get(c) + count(triangle,r+1,c,dp,visited);
        int dia = triangle.get(r).get(c) + count(triangle,r+1,c+1,dp,visited);
        visited[r][c] = true;
        return dp[r][c] = Math.min(down,dia);
    }
}