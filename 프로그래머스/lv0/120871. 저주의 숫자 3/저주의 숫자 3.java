class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n + 1; i++) {
            while (answer % 3 == 0 || (answer+"").contains("3")) {
                answer++;
            }
            answer++;
        }
        answer--;
        
        return answer;
    }
}