class Solution {
    public String solution(String s) {
        String answer = "";
        
        answer = (s.length() % 2 == 1) ? s.substring(s.length() / 2 , (s.length() / 2) + 1) : s.substring((s.length() / 2) - 1 , (s.length() / 2) + 1);
        return answer;
    }
}