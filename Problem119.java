class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for(int col = 0;col<=rowIndex;col++){
            ans.add(getele(rowIndex,col));
        }
        return ans;
    }
    public int getele(int r,int c){
        long ele = 1;

        for(int i = 0;i<c;i++){
            ele = ele*(r-i);
            ele = ele/(i+1);
        }
        return (int)ele;
    }
}