class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            int row = maxEle(mat,mat.length,mat[0].length,mid);
            int left = mid > 0 ? mat[row][mid-1]:-1;
            int right = mid+1 < mat[0].length ? mat[row][mid+1] : -1;

            if(mat[row][mid] > left && mat[row][mid] >right){
                return new int[]{row,mid};
            }else if(mat[row][mid] <left){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    private int maxEle(int[][] mat,int n,int m,int mid){
        int maxValue = -1;
        int index = -1;

        for(int i = 0;i<n;i++){
            if(mat[i][mid] > maxValue){
                maxValue = mat[i][mid];
                index = i;
            }
        }
        return index;
    }
}