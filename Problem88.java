class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || nums2.length==0){
            return;
        }
        int[] merge = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(nums1[i]<=nums2[j]){
                merge[k] = nums1[i];
                i++;
            }else{
                merge[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            merge[k] = nums1[i];
            k++;
            i++;
        }
        while(j<n){
            merge[k] = nums2[j];
            j++;
            k++;
        }
        for(int l = 0;l<merge.length;l++) {
            nums1[l] = merge[l];
        }
    }
}