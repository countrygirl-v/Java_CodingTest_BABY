import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = n - 1; i < num_list.length; i++) answer.add(num_list[i]);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}