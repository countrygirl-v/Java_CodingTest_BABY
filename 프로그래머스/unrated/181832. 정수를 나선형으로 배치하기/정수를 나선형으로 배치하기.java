class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int number = 1;
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n - 1;
        int colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = number++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = number++;
            }
            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = number++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = number++;
            }
            colStart++;
        }
        return answer;
    }
}