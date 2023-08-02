class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "up" -> answer[1]++;
                case "down" -> answer[1]--;
                case "right" -> answer[0]++;
                case "left" -> answer[0]--;
            }
            if (Math.abs(answer[0]) >= (board[0] - 1) / 2) {
                answer[0] = answer[0] > 0 ? (board[0] - 1) / 2 : (board[0] - 1) / 2 * (-1);
            }
            if (Math.abs(answer[1]) >= (board[1] - 1) / 2) {
                answer[1] = answer[1] > 0 ? (board[1] - 1) / 2 : (board[1] - 1) / 2 * (-1);
            }
        }
        return answer;
    }
}