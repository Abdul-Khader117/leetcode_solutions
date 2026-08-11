class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int max_sum = nums[0];
        Set<Integer> hs = new HashSet<>();
        for(int i=0; i<n; i++){
            hs.add(nums[i]);
        }
        for(int i=1; i<n; i++){
            if(nums[i-1] + 1 == nums[i]){
                max_sum += nums[i];
            }
            else{
                break;
            }
        }
        while(hs.contains(max_sum)){
            max_sum++;
        }
        return max_sum;
    }
}