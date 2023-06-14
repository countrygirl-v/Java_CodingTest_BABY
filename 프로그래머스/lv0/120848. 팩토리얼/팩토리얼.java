class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        for (int i = 1; i < 11; i++) {
            factorial = 1;
            for (int j = 1; j < i+1; j++) {
                factorial *= j;
            }
            if (factorial > n) break;
            answer = i;
        }
        return answer;
    }
}