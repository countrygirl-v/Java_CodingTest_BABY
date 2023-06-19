class Solution {
    public long solution(long n) {
        long answer = 0;
        int check = 0;
        check = (n % Math.sqrt(n) == 0) ? 1 : 2;
        if (check == 1) {
            answer = (long)((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        } else answer = -1;
        return answer;
    }
}