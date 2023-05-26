class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        answer += n / slice;
        if (n % slice > 0 || n < slice) answer += 1 ;
        
        return answer;
    }
}