class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1;i<=numRows;i++){
            List<Integer> temp = generateRow(i);
            list.add(generateRow(i));
        }
        return list;

    }
    public List<Integer> generateRow(int numRows){
        long ans = 1;
        List<Integer> temp = new ArrayList<>();
        temp.add((int)ans);

        for(int col = 1;col<numRows;col++){
            ans = ans*(numRows-col);
            ans = ans/ (col);
            temp.add((int)ans);
        }
        return temp;
    }
}