class Solution {
    public int solution(int a, int b) {
        int answer = Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
        return answer;
    }
}