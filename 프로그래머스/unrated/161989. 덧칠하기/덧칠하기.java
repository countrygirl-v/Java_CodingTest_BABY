class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        if(section[section.length-1] - section[0] + 1 > m) answer = 2;
        else answer = 1;
        return answer;
    }
}