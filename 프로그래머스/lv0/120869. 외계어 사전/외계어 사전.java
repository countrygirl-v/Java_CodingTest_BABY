import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int count = 0;
        List<Boolean> checkList = new ArrayList<>();

        for (String s : dic) {
            checkList.clear();
            count = 0;
            for (int i = 0; i < spell.length; i++) {
                checkList.add(s.contains(spell[i]));
            }
            for (Boolean check : checkList) if (check) count++;
            if (count == spell.length) break;
        }
        answer = count == spell.length ? 1 : 2;
        return answer;
    }
}