class Solution {
    public boolean isPossible(int[] bloomDay, int day, int m, int k){
        int n = bloomDay.length;
        int count = 0, noofB = 0;
        for(int i=0; i<n; i++){
            if(bloomDay[i] <= day){
                count++;
            }
            else{
                noofB += count/k;
                count = 0;
            }
        }
        noofB += count / k;
        return noofB >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n < m * k){
            return -1;
        }
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            minDay = Math.min(minDay, bloomDay[i]);
            maxDay = Math.max(maxDay, bloomDay[i]);
        }
        int low = minDay, high = maxDay;
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(isPossible(bloomDay, mid, m, k)){
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