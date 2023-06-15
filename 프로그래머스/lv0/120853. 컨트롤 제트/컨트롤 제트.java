import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strings = s.split(" ");
        Stack<String> stringStack = new Stack<String>();
        
        for (String str : strings) {
            if (str.equals("Z")) stringStack.pop();
            else stringStack.push(str);
        }
        
        String[] stringArray = new String[stringStack.toArray().length];
        int[] answerArray = new int[stringArray.length];
        
        for (int i = 0; i < stringStack.size(); i++) {
            stringArray[i] = (String) stringStack.toArray()[i];
            answerArray[i] = Integer.parseInt(stringArray[i]);
            answer += answerArray[i];
        }
        return answer;
    }
}