class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        return climb(arr, n);
    }

    private int climb(int[] arr, int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        if(arr[n]==0){
            arr[n] = climb(arr, n-1) + climb(arr, n-2);
        }
        return arr[n];
    }
}
