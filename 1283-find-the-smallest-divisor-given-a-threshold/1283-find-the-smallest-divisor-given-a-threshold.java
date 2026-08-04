class Solution {
    public int sumofD(int[] nums, int d){
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += (int)Math.ceil((double)nums[i] / (double)d);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n > threshold){
            return -1;
        }
        int low = 1, high = Arrays.stream(nums).max().getAsInt();
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(sumofD(nums, mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}