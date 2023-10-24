import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i : delete_list) {
            answer.remove(Integer.valueOf(i));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}