import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) temp.add(rank[i]);
        }
        for (int i = 0; answer.size() != 3; i++) {
            int min = temp.stream().min(Integer::compareTo).orElseThrow();
            for (int j = 0; j < rank.length; j++) {
                if (min == rank[j]) {
                    answer.add(j);
                    temp.remove(Integer.valueOf(min));
                }
            }
        }
        return answer.get(0) * 10000 + 100 * answer.get(1) + answer.get(2);
    }
}