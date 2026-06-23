class Solution {
    public void rotate(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        for(int i = 0;i<matrix.length;i++){
            int k = matrix.length-1-i;
            for(int j = 0;j<matrix.length;j++){
                ans[j][k] = matrix[i][j];
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}