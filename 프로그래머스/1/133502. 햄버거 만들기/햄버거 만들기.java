import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> burger = new ArrayList<>();

        for (int ingre : ingredient) {
            burger.add(ingre);

            while (burger.size() >= 4 && burger.subList(burger.size() - 4, burger.size()).equals(Arrays.asList(1, 2, 3, 1))) {
                answer++;
                burger.subList(burger.size() - 4, burger.size()).clear();
            }
        }
        return answer;
    }
}