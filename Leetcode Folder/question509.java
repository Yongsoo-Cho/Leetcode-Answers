class Solution {
    public int fib(int n) {
        int[] arr = new int[n+1];

        return fibNum(arr, n);
    }
    private int fibNum(int[] arr, int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        else{
            if(arr[n]==0){
                arr[n] = fibNum(arr, n-1) + fibNum(arr, n-2);
            }

            return arr[n];
        }
    }
}
