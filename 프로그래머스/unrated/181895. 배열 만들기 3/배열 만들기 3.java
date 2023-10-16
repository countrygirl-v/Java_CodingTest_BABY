import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] interval1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] interval2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        List<Integer> answer = new ArrayList<>();
        answer.addAll(Arrays.stream(interval1).boxed().collect(Collectors.toList()));
        answer.addAll(Arrays.stream(interval2).boxed().collect(Collectors.toList()));
        return answer.stream().mapToInt((Integer::intValue)).toArray();
    }
}