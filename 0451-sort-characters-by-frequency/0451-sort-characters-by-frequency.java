class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        List<Character> chars = new ArrayList<>(freq.keySet());
        Collections.sort(chars, (a, b) -> freq.get(b) - freq.get(a));
        StringBuilder ans = new StringBuilder();
        for(char c : chars){
            int count = freq.get(c);
            for(int i=0; i<count; i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}