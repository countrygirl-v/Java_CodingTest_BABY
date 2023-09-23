import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                newArray.add(array[j - 1]);
            }
            Collections.sort(newArray);
            answer[i] = newArray.get(commands[i][2] - 1);
            newArray.clear();
        }
        return answer;
    }
}