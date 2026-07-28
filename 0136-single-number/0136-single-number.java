class Solution {
    public int singleNumber(int[] nums) {
        int numb = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            numb = numb ^ nums[i];
        }
        return numb;
    }
}