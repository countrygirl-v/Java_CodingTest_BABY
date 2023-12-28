class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[h][w].equals(board[i][j])) {
                    if (Math.abs(h - i) < 2 && Math.abs(w - j) < 2 && Math.abs(h - i) == 1 ^ Math.abs(w - j) == 1) answer++;
                }
            }
        } 
        return answer;
    } 
}