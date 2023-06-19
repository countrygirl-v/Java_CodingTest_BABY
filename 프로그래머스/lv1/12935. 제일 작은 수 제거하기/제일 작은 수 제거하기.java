import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        if (arr.length == 1) {
            int[] length1 = {-1};
            answer = length1;
        } else {

            Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

            Arrays.sort(integerArray, Collections.reverseOrder());
            
            int[] tempArray = new int[arr.length - 1];
            for (int i = 0; i < answer.length; i++) {
                tempArray[i] = (int) integerArray[i];
            }
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                int arrayNumber = arr[i];
                for (int j = 0; j < tempArray.length; j++) {
                    if (arrayNumber == tempArray[j]) {
                        answer[k] = tempArray[j];
                        k++;
                    }
                }
            }
        }
        return answer;
    }
}