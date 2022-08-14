class Solution{
    public int[] sortArray(int[] nums){
        if(nums == null || nums.length==0) return nums;
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    private void quickSort(int[] arr, int left, int right){
        if(left>=right) return;
        int mid = partition(arr, left, right);
        quickSort(arr, left, mid);
        quickSort(arr, mid+1, right);
    }

    private int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        while(left<right){
            while(left<right && arr[right]>=pivot) right--;
            arr[left] = arr[right];
            while(left<right && arr[left]<=pivot) left++;
            arr[right] = arr[left];
        }
        arr[left]=pivot;
        return left;
    }
}
