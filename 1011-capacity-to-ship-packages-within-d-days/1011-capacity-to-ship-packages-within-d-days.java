class Solution {

    public static int helper(int[] nums, int mid){
        int days = 1;
        int weight = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(weight + nums[i] <= mid){
                weight += nums[i];
            }
            else{
                weight = nums[i];
                days++;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int num : weights){
            low = Math.max(low, num);
            high += num;
        }
        int ans = weights.length;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(helper(weights, mid) > days){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}