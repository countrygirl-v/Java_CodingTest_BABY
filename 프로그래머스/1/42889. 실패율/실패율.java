import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int player = 0;
            int noClear = 0;

            List<Double> rate = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                for (int j = 0; j < stages.length; j++) {
                    if (stages[j] - i >= 0) player++;
                    if (stages[j] == i) noClear++;
                }
                if (player == 0) rate.add(0.0);
                else rate.add((double) noClear / player);
                player = 0;
                noClear = 0;
            }
            Map<Integer, Double> map = new HashMap<>();
            for (int i = 0; i < rate.size(); i++) {
                map.put(i + 1, rate.get(i));
            }
            List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(map.entrySet());
            entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
            int[] answer = new int[rate.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = entryList.get(i).getKey();
            }
            return answer;
    }
}