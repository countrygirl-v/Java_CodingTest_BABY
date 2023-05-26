import java.lang.Math;

class Solution {
    public long solution(long n) {
        int answer = 0;
        answer = n % Math.sqrt(n) == 0 ? 1 : 2;
              
        
        return answer;
    }
}