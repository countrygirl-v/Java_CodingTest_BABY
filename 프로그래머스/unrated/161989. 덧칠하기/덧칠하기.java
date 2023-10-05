class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int temp = section[0];

        for (int i : section) {
            if (temp + m - 1 < i) {
                answer++;
                temp = i;
            }
        }
        return answer;
    }
}