import java.util.*;


class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> fibonacci = new ArrayList<>(Arrays.asList(0, 1));

        
        for(int i = 0; i < n; i++) {
            fibonacci.add((fibonacci.get(i) + fibonacci.get(i+1)) % 1234567);
        }
        answer = fibonacci.get(n);
        return answer;
    }
}