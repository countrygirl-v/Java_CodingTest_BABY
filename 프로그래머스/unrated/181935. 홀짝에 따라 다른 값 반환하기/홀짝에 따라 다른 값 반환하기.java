class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = (n % 2 == 0) ? 0 : 1; i <= n; i += 2) answer += (n % 2 == 0) ? i * i : i;
        return answer;
    }
}