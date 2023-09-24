import java.util.ArrayList;
import java.util.Collections;
import java.util.List;    

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            temp.add(score[i]);
            Collections.sort(temp, Collections.reverseOrder());
            if(temp.size() > k) temp.remove(temp.size()-1);
            answer[i] = temp.get(temp.size() - 1);
        }
        return answer;
    }
}