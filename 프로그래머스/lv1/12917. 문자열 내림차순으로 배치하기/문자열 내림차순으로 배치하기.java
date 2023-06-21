import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] sArray = s.split("");
        String answer = "";
        Arrays.sort(sArray, Collections.reverseOrder());
        for (int i = 0; i < sArray.length; i++) answer += sArray[i];
        return answer;
    }
}