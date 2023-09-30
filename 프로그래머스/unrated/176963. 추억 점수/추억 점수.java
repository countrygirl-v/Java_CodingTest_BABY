import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < photo.length; i++) {
            list.addAll(Arrays.asList(photo[i]));
            for (int j = 0; j < name.length; j++) {
                if(list.contains(name[j])) answer[i] += yearning[j];
            }
            list.clear();
        }
        return answer;
    }
}