import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        int n = 0;
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        while (list.size() != Math.pow(2, n)) {
            n++;
            for (int j = list.size(); j < Math.pow(2, n); j++) list.add(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}