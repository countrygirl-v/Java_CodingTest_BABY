import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] factor = new int[number + 1];
        Set<Integer> temp = new HashSet<>();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= Math.sqrt(number); j++) {
                if (i % j == 0) {
                    temp.add(j);
                    temp.add(i/j);
                }
                factor[i] = temp.size();
            }
            temp.clear();
            if (factor[i] > limit) factor[i] = power;
            answer += factor[i];
        }
        return answer;
    }
}