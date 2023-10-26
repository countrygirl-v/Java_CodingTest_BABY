import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (String s : picture) {
            for (int i = 0; i < s.length(); i++) {
                temp.append((String.valueOf(s.charAt(i))).repeat(k));
            }
            for (int i = 0; i < k; i++) answer.add(temp.toString());
            temp = new StringBuilder();
        }
        return answer.toArray(new String[0]);
    }
}