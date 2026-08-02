class Solution {
    public int findFirst(int[] nums, int target){
        int n = nums.length;
        int start = 0, end = n - 1;
        int first = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            if(nums[mid] == target){
                first = mid;
                end = mid - 1;
            }
        }
        return first;
    }

    public int findLast(int[] nums, int target){
        int n = nums.length;
        int start = 0, end = n - 1;
        int last = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            if(nums[mid] == target){
                last = mid;
                start = mid + 1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int f = findFirst(nums, target);
        int l = findLast(nums, target);
        return new int[]{f, l};
    }
}