class Solution{
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    private void mergeSort(int[] arr){
        if(arr.length<=1) return;
        int mid = arr.length/2;

        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];

        for(int i=0; i<mid; i++){
            left[i] = arr[i];
        }
        for(int i=mid; i<arr.length; i++){
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);

        return;
    }
}
