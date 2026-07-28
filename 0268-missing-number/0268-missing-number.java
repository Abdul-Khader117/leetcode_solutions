class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long act_sum = n * (n + 1) / 2;
        for(int i=0; i<n; i++){
            act_sum -= nums[i];
        }
        return (int)act_sum;
    }
}