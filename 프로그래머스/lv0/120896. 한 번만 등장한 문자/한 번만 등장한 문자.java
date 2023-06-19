import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        
        String[] charString = s.split("");
        Arrays.sort(charString);
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (charString[i].equals(charString[j])) count++;
            }
            if (count == 1) answer += charString[i];
        }
        return answer;
    }
}