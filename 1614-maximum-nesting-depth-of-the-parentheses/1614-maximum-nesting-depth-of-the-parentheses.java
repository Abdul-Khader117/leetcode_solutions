class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxdepth = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                depth++;
                maxdepth = Math.max(maxdepth, depth);
            }
            else if(c == ')'){
                depth--;
            }
        }
        return maxdepth;
    }
}