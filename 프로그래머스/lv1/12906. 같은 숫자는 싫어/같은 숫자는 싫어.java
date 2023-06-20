import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> integerStack = new Stack<>();
        int previousNumber = 10;
        for (int i : arr) {
            if (i != previousNumber) integerStack.push(i);
            previousNumber = i;
        }
        int[] answer = new int[integerStack.size()];
        for (int i = integerStack.size() - 1; i >= 0 ; i--) {
            answer[i] = integerStack.pop();
        }
        return answer;
    }
}