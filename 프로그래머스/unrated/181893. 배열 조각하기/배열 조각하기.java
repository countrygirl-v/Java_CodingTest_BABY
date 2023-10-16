import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                answer = answer.subList(0, query[i] + 1);
            } else {
                answer = answer.subList(query[i], answer.size());
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}