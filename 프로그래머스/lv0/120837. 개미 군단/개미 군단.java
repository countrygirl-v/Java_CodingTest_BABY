class Solution {
    public int solution(int hp) {
        int answer = hp / 5 + (hp - hp / 5 * 5) / 3 + hp - hp / 5 * 5 - (hp - hp / 5 * 5) / 3 * 3;
        return answer;
    }
}