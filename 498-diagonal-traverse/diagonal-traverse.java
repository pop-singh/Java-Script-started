class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        Map<Integer, List<Integer>> diagonalMap = new HashMap<>();
        
        // Group elements by their diagonal index (i + j)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int key = i + j;
                diagonalMap.computeIfAbsent(key, k -> new ArrayList<>()).add(mat[i][j]);
            }
        }
        
        // Prepare the result array
        int[] result = new int[n * m];
        int idx = 0;
        
        // Traverse each diagonal group, reverse if needed, and collect in order
        for (int d = 0; d < n + m - 1; d++) {
            List<Integer> diagonal = diagonalMap.get(d);
            if (d % 2 == 0) { // Reverse even diagonals for zigzag
                Collections.reverse(diagonal);
            }
            for (int val : diagonal) {
                result[idx++] = val;
            }
        }
        
        return result;
    }
}
