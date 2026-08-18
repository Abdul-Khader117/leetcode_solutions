class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int high = s.length() - 1;
        while(high >= 0){
            while(high >= 0 && s.charAt(high) == ' '){
                high--;
            }
            if(high < 0){
                break;
            }
            int end = high;
            while(high >= 0 && s.charAt(high) != ' '){
                high--;
            }
            String word = s.substring(high + 1, end + 1);
            if(sb.length() > 0){
                sb.append(" ");
            }
            sb.append(word);
        }
        return sb.toString();
    }
}