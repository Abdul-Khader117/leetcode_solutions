class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int min_val = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[low] <= nums[mid]){
                min_val = Math.min(min_val, nums[low]);
                low = mid + 1;
            }
            else{
                min_val = Math.min(min_val, nums[mid]);
                high = mid - 1;
            }
        }
        return min_val;
    }
}