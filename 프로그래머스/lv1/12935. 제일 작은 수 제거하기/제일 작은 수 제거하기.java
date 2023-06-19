import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            int[] answer = new int[]{-1};
            return answer;
        }

        // 제일 작은 요소 빼서 리턴
        int[] result = new int[arr.length - 1];

        Object[] array = Arrays.stream(arr)
                .sorted()
                .boxed().toArray();

        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < result.length; i++) {
            result[i] = (int) array[i];
        }
        int[] result2 = new int[result.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            // {1, 12, 32, 6, 3, 234, 5623, 6, 2}
            int num = arr[i];
            for (int j = 0; j < result.length; j++) {
                if( num == result[j]){
                    result2[k] = result[j];
                    k++;
                }
            }
        }
        return result2;
    }
}