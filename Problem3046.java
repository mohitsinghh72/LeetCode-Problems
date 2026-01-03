class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] nums1 = new int[nums.length/2];
        int[] nums2 = new int[nums.length/2];
        Arrays.sort(nums);

        if(nums.length == 0){
            return false;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums.length){
            if(i%2 == 0){
                nums2[k] = nums[i];
                k++;
            }else{
                nums1[j] = nums[i];
                j++;
            }
            i++;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = 0;
        while(m < nums1.length){
            if(m+1<nums1.length && nums1[m] == nums1[m+1]){
                return false;
            }
            m++;
        }
        int n = 0;
        while(n < nums2.length){
            if(n+1 < nums2.length && nums2[n] == nums2[n+1]){
                return false;
            }
            n++;
        }

        return true;

    }
}

