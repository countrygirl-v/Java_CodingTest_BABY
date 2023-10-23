import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> box = new Stack<>();
        for (int move : moves) {
            int doll = 0;
            for (int i = 0; i < board.length; i++) {
                int currentDoll = board[i][move - 1];
                if (currentDoll != 0) {
                    doll = currentDoll;
                    board[i][move - 1] = 0;
                    break;
                }
            }
            if (doll == 0) continue;
            if (!box.isEmpty() && box.peek() == doll) {
                box.pop();
                answer += 2;
            } else box.push(doll);
        }

        return answer;
    }
}