class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalbeauty = 0;
        for(int i=0; i<n; i++){
            int[] freq = new int[26];
            for(int j=i; j<n; j++){
                char c = s.charAt(j);
                freq[c - 'a']++;
                int maxfreq = 0, minfreq = Integer.MAX_VALUE;
                for(int f : freq){
                    if(f > 0){
                        maxfreq = Math.max(maxfreq, f);
                        minfreq = Math.min(minfreq, f);
                    }
                }
                totalbeauty += (maxfreq - minfreq);
            }
        }
        return totalbeauty;
    }
}