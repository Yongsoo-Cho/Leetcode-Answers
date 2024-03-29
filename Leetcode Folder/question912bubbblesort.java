class Solution {
    public int[] sortArray(int[] nums){
        bubbleSort(nums);
        return nums;
    }
    private void bubbleSort(int[] nums){
        for(int i=nums.length-1; i>=1; i--){
            for(int j=0; j<i; j++){
                if(nums[j]>nums[j+1]) swap(nums, j, j+1);
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
