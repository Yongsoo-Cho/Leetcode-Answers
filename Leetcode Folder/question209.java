class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while(j < nums.length){
            while(sum<target && j<nums.length){
                sum+=nums[j];
                j++;
            }

            while(sum>=target && i<nums.length){
                min = Math.min(j-i,min);
                sum-=nums[i];
                i++;
            }
        }

        if(min==Integer.MAX_VALUE) return 0;
        return min;

    }
}
