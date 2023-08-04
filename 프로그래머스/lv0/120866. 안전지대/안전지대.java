class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int[][] changeBoard = new int[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                changeBoard[i][j] = board[i][j];
            }
        }
        if (board.length == 1) {
            answer = 0;
        } else {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 1) {
                        if (i == 0) {
                            if (j == 0) {
                                changeBoard[0][1] = 1;
                                changeBoard[1][0] = 1;
                                changeBoard[1][1] = 1;
                            } else if (i == 0 && j == board.length - 1) {
                                changeBoard[0][board.length - 1] = 1;
                                changeBoard[1][board.length - 1] = 1;
                                changeBoard[1][board.length - 2] = 1;
                            } else {
                                changeBoard[0][j - 1] = 1;
                                changeBoard[1][j + 1] = 1;
                                changeBoard[1][j] = 1;
                                changeBoard[1][j - 1] = 1;
                                changeBoard[1][j + 1] = 1;
                            }
                        } else if (i == board.length - 1) {
                            if (j == 0) {
                                changeBoard[board.length - 1][1] = 1;
                                changeBoard[board.length - 2][0] = 1;
                                changeBoard[board.length - 2][1] = 1;
                            } else if (j == board.length - 1) {
                                changeBoard[board.length - 1][board.length - 2] = 1;
                                changeBoard[board.length - 2][board.length - 1] = 1;
                                changeBoard[board.length - 2][board.length - 2] = 1;
                            } else {
                                changeBoard[board.length - 1][j - 1] = 1;
                                changeBoard[board.length - 1][j + 1] = 1;
                                changeBoard[board.length - 2][j] = 1;
                                changeBoard[board.length - 2][j - 1] = 1;
                                changeBoard[board.length - 2][j + 1] = 1;
                            }
                        } else if (i > 0 && i < board.length - 1) {
                            if (j == 0) {
                                changeBoard[i][j + 1] = 1;
                                changeBoard[i + 1][j] = 1;
                                changeBoard[i - 1][j] = 1;
                                changeBoard[i - 1][j + 1] = 1;
                                changeBoard[i + 1][j + 1] = 1;
                            } else if (j == board.length - 1) {
                                changeBoard[i][j - 1] = 1;
                                changeBoard[i + 1][j] = 1;
                                changeBoard[i - 1][j] = 1;
                                changeBoard[i - 1][j - 1] = 1;
                                changeBoard[i + 1][j - 1] = 1;
                            } else {
                                changeBoard[i][j - 1] = 1;
                                changeBoard[i][j + 1] = 1;
                                changeBoard[i - 1][j] = 1;
                                changeBoard[i + 1][j] = 1;
                                changeBoard[i + 1][j - 1] = 1;
                                changeBoard[i + 1][j + 1] = 1;
                                changeBoard[i - 1][j - 1] = 1;
                                changeBoard[i - 1][j + 1] = 1;
                            }
                        }
                    }
                }

            }
        }


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (changeBoard[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}