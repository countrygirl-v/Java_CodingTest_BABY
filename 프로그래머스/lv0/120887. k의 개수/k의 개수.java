class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int n = i; n < j + 1; n++) {
            int number = n;
            while (number > 0) {
                if (number % 10 == k) answer++;
                number /= 10;
            }
        }
        return answer;
    }
}