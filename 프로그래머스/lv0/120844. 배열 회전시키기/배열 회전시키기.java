class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (i > numbers.length - 1) i -= numbers.length;
                answer[i+1] = numbers[i];

            }
            answer[0] = numbers[numbers.length-1];
        } else {
            for (int i = numbers.length - 1; i > 0; i--) {
                if (i < 0) i = numbers.length - 1;
                answer[i-1] = numbers[i];
            }
            answer[numbers.length-1] = numbers[0];
        }
        return answer;
    }
}