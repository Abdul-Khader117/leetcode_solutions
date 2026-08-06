class Solution {
    public int daysNeeded(int[] weights, int capacity){
        int n = weights.length;
        int days = 1;
        int load = 0;
        for(int i=0; i<n; i++){
            if(load + weights[i] > capacity){
                days++;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = left + (right - left) / 2;
            int needed = daysNeeded(weights, mid);
            if (needed <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}