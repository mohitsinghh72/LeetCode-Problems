class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<mountain.length){
            if(i+2 < mountain.length && mountain[i]<mountain[i+1] && mountain[i+1]>mountain[i+2]){
                list.add(i+1);
            }
            i++;
        }
        return list;

    }
}