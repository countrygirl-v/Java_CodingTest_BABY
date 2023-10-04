import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        List<Integer> scoreList = new ArrayList<>();
        
        for (int i : score) scoreList.add(i);
        scoreList.sort(Collections.reverseOrder());
        
        Queue<Integer> queue = new LinkedList<>(scoreList);
        scoreList.clear();
        
        for (int i = 0; i < score.length / m; i++) {
            for (int j = 0; j < m; j++) scoreList.add(queue.poll());
            answer += scoreList.get(scoreList.size()-1) * m;
            scoreList.clear();
        }
        return answer;
    }
}