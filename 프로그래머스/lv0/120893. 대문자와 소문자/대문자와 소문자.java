class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
             if(my_string.charAt(i) > 64 && my_string.charAt(i) < 97) answer += (char)(my_string.charAt(i) + 32);
             else if(my_string.charAt(i) > 96) answer += (char)(my_string.charAt(i) - 32);
            }
        return answer;
    }
}