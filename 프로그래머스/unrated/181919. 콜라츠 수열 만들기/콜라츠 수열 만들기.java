import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        while (true) {
            list.add(n);
            if(n == 1) break;
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}