import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String myString, String pat) {
        List<String> subString = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            subString.add(myString.substring(i, pat.length() + i));
            if (subString.get(i).equals(pat)) answer++;
        }
        return answer;
    }
}