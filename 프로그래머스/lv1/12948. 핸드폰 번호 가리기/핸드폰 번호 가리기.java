class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        for (int i = 0; i < sb.length() - 4; i++) sb.setCharAt(i, '*');
        String answer = sb.toString();
        
        return answer;
    }
}