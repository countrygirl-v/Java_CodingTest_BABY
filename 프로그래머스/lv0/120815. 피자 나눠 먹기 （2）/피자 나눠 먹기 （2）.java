class Solution {
    public int solution(int n) {
        int leastCommon = 0;
        int comm = 0;
        for(int i = 1; i < 101; i++){
            if(n % i == 0 && 6 % i == 0) comm = i;
        }
        int answer = n / comm;
        return answer;
    }
}