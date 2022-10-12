class Solution {
    public int equalPairs(int[][] grid) {

        int n = grid.length;

        int[] row = new int[n]; // array for storing rows element of the 2d array
        int[] col = new int[n]; // array for storing column''s element of the 2d array
        int col_count = 0;
        int ans = 0;

        while (col_count < n) {

            for (int i = 0; i < n; i++) {
                col[i] = grid[i][col_count]; // storing column's element in col array
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    row[j] = grid[i][j]; // storing row's element in row array
                }

                if (Arrays.equals(col, row)) { // compareingf both arrays
                    ans++;
                }
            }
            col_count++;
        }
        return ans;
    }
}