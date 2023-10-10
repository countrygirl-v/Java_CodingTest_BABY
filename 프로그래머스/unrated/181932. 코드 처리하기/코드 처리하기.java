class Solution {
    public String solution(String code) {
        char[] codeArray = code.toCharArray();
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (codeArray[i] == '1') mode = 1;
                else {
                    if (i % 2 == 0) answer.append(codeArray[i]);
                }
            } else {
                if (codeArray[i] == '1') mode = 0;
                else {
                    if (i % 2 != 0) answer.append(codeArray[i]);
                }
            }
        }
        if (answer.length() == 0) return "EMPTY";
        
        return answer.toString();
    }
}