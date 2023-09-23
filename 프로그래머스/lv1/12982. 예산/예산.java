import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        if(Arrays.stream(d).sum() == budget) answer = d.length;
        else {
            Arrays.sort(d);
            for (int i : d) {
                budget -= i;
                if(budget < 0) break;
                answer++;
            }
        }
        return answer;
    }
}