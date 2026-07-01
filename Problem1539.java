class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i = 0;i<arr.length;i++){
            if(arr[i] <= k){
                k++;
            }else{
                break;
            }
        }
        return
    }
}

// Solution - 2 (Time Complexity - O(logn)
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            int missing = arr[mid]-(mid+1);
            if(missing < k){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start+k;
    }
}