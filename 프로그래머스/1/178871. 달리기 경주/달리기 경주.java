import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int n = players.length;
        String[] answer = new String[n];
        Map<String, Integer> map = new HashMap<>();
        String[] ranks = new String[n];

        for (int i = 0; i < n; i++) {
            map.put(players[i], i);
            ranks[i] = players[i];
        }

        for (String calling : callings) {
            int index = map.get(calling);
            ranks[index] = ranks[index - 1];
            ranks[index - 1] = calling;
            map.put(ranks[index], index);
            map.put(calling, index - 1);
        }

        return ranks;
    }
}