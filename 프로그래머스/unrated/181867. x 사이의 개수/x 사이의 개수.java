import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String myString) {
        List<String> xSplit = new ArrayList<>(Arrays.asList(myString.split("x", -1)));
        int[] answer = new int[xSplit.size()];
        for (int i = 0; i < xSplit.size(); i++) {
            answer[i] = xSplit.get(i).length();
        }
        return answer;
    }
}