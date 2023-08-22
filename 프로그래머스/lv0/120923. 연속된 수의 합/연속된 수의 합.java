import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int num, int total) {
       
        int[] answer = new int[num];

        List<Integer> numList = new ArrayList<>();

        float midNumber = (float) total / num;
        int intMidNumber = total / num;
        
        if (midNumber == intMidNumber) {
            for (int i = num / 2; i > 0; i--) {
                numList.add(intMidNumber - i);
            }
            numList.add(intMidNumber);
            for (int i = 1; i < num / 2 + 1; i++) {
                numList.add(intMidNumber + i);
            }
        } else {
            for (int i = num / 2 - 1; i > 0; i--) {
                numList.add((int) midNumber - i);
            }
            numList.add(intMidNumber);
            for (int i = 1; i < num / 2 + 1; i++) {
                numList.add((int) midNumber+ i);
            }
        }

        for (int i = 0; i < num; i++) {
            answer[i] = numList.get(i);
        }
        return answer;
    }
}