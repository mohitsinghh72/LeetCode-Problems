class Solution {
    public int findSpecialInteger(int[] arr) {
        int temp = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i - 1]){
                temp++;
                if(temp > arr.length / 4){
                    return arr[i];
                }
            }else{
                temp = 1;
            }
        }
        return arr[0];
    }
}