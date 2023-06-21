class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            int asc = (int)s.charAt(i);
            if (asc > 64 && asc < 91) asc = ((asc - 65) + n)%26 + 65;
            else if (asc > 96 && asc < 123) asc = ((asc - 97) + n)%26 + 97;
            answer += (char) asc;
        }
        
        return answer;
    }
}