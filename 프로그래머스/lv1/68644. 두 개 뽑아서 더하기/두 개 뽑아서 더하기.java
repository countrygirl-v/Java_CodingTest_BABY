import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> integerSet = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                integerSet.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[integerSet.size()];
        int id = 0;
        for (Integer integer : integerSet) {
            answer[id] = integer;
            id++;
        }
        return answer;
    }
}