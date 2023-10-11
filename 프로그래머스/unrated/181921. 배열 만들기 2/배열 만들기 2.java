import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> stringList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("^[05]+$")) stringList.add(i);
        }
        if (stringList.size() == 0) return new int[] {-1};
        return stringList.stream().mapToInt(Integer::intValue).toArray();
    }
}