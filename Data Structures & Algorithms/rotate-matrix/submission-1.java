class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
    }

    public void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void reverse(int[] mat) {
        int l = 0;
        int r = mat.length - 1;
        while (l < r) {
            int temp = mat[l];
            mat[l] = mat[r];
            mat[r] = temp;
            l++;
            r--;
        }
    }
}
