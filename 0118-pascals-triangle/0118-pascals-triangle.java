class Solution {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        for(int row = 0; row < numRows; row++){
            List<Integer> ansRow = new ArrayList<>();
            ansRow.add(1);
            long val = 1;
            for (int col = 1; col <= row; col++) {
                val = val * (row - col + 1) / col;
                ansRow.add((int) val);
            }
            result.add(ansRow);
        }
        return result;
    }
}
