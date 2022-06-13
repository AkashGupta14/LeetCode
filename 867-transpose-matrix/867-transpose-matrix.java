class Solution {
    public int[][] transpose(int[][] a) {
        int[][] x = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                x[j][i] = a[i][j];
            }
        }
        return x;
    }
}