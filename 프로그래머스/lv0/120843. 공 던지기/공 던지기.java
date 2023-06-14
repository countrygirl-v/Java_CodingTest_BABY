class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int ball = 0;

        for(int i = 2; ball < k - 1; i += 2) {
            if (i > numbers.length - 1) i -= numbers.length;
            ball ++;
            answer = numbers[i];
        }
        return answer;
    }
}