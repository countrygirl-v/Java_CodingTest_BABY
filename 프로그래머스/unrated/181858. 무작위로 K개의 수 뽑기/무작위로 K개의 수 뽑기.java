import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (!list.contains(i) && list.size() <= k) list.add(i);
            if (list.size() == k) break;
        }
        int listSize = list.size();
        if (list.size() < k) {
            for (int i = 0; i < k - listSize; i++) {
                list.add(-1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}