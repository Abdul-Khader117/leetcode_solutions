class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int el=nums[0];
        int cnt=1;
        for(int i=1;i<n;i++){
            if(cnt==0){
                el=nums[i];
                cnt=1;
            }
            else if(nums[i]==el){
                cnt++;
            }else{
                cnt--;
            }
        }
        return el;
    }
}