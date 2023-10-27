class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 0, 11}};
        int[] presentLeft = {3, 0};
        int[] presentRight = {3, 2};
        for (int number : numbers) {
            int[] target = null;
            for (int i = 0; i < keypad.length; i++) {
                for (int j = 0; j < keypad[i].length; j++) {
                    if (number == keypad[i][j]) {
                        target = new int[]{i, j};
                        break;
                    }
                }
            }
            if (target != null) {
                int leftDistance = Math.abs(presentLeft[0] - target[0]) + Math.abs(presentLeft[1] - target[1]);
                int rightDistance = Math.abs(presentRight[0] - target[0]) + Math.abs(presentRight[1] - target[1]);
                if (number == 1 || number == 4 || number == 7) {
                    answer.append("L");
                    presentLeft = target;
                } else if (number == 3 || number == 6 || number == 9) {
                    answer.append("R");
                    presentRight = target;
                } else {
                    if (leftDistance < rightDistance) {
                        answer.append("L");
                        presentLeft = target;
                    } else if (leftDistance > rightDistance) {
                        answer.append("R");
                        presentRight = target;
                    } else {
                        if (hand.equals("left")) {
                            answer.append("L");
                            presentLeft = target;
                        } else {
                            answer.append("R");
                            presentRight = target;
                        }
                    }
                }
            }
        }
        return answer.toString();
    }
}