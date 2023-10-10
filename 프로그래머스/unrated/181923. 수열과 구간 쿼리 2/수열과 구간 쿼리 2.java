import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < queries.length; i++) {
                for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                    if (queries[i][2] < arr[j]) temp.add(arr[j]);
                }
                if (temp.size() > 0) {
                    Collections.sort(temp);
                    answer[i] = temp.get(0);
                    temp.clear();
                } else answer[i] = -1;
            }
            return answer;
    }
}