class Solution {
    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            HashSet<Integer> map = new HashSet<>();
            for (int j = 0; j < matrix.length; j++) {
                if (!map.add(matrix[i][j])) {
                    return false;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            HashSet<Integer> map = new HashSet<>();
            for (int j = 0; j < matrix.length; j++) {
                if (!map.add(matrix[j][i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
