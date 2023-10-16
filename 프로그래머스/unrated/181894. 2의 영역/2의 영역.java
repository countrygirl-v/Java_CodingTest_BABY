import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        boolean check = false;
        for (int i : arr) {
            if (i == 2) {
                check = true;
                break;
            }
        }
        if (!check) return new int[] {-1};

        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = start; i < end + 1; i++) {
            answer.add(arr[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}