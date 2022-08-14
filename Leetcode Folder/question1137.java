class Solution {
    public int tribonacci(int n) {
        int[] arr = new int[n+1];
        return tribNum(arr, n);
    }

    private int tribNum(int[] arr, int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;

        else{
            if(arr[n]==0){
                arr[n] = tribNum(arr, n-1) + tribNum(arr, n-2) + tribNum(arr, n-3);
            }

            return arr[n];
        }
    }
}
