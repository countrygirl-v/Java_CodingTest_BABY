import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        List<String> s = new ArrayList<>();
        for (int i = 0; i < t.length() - (p.length() - 1); i++) {
            s.add(t.substring(i, i + p.length()));
            if(Double.parseDouble(p) >= Double.parseDouble(s.get(i))) answer++;
        }
        return answer;
    }
}