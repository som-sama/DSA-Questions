class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] dup = new int[matrix[0].length][matrix.length];
        int len1 = dup.length;
        int len2 = matrix.length;
        for(int rows=0; rows<len1; rows++){
            for(int col=0; col<len2; col++){
                dup[rows][col] = matrix[col][rows];
            }
        }
        return dup;
    }
}