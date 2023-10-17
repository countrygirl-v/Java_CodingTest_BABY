import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] num_list) {
        List<Integer> oddIndexList = new ArrayList<>();
        List<Integer> evenIndexList = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) oddIndexList.add(num_list[i]);
            else evenIndexList.add(num_list[i]);
        }
        return Math.max(
                oddIndexList.stream().mapToInt(Integer::intValue).sum(),
                evenIndexList.stream().mapToInt(Integer::intValue).sum()
        );
    }
}