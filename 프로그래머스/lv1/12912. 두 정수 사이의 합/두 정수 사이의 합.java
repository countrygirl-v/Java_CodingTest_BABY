class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a < b) {
            for (int i = a; i < b + 1; i++) answer += i;
        } else {
            for (int j = b; j < a + 1; j++) answer += j;
        }
        
        return answer;
    }
}