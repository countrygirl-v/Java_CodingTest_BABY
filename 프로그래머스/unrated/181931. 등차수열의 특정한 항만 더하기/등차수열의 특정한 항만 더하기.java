import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < included.length; i++) list.add(a + d * i);
        for (int i = 0; i < included.length; i++) if (included[i]) answer += list.get(i);
        return answer;
    }
}