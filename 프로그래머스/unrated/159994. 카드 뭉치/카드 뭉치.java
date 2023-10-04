import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        List<String> stringList = new ArrayList<>();
        Queue<String> cardQueue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cardQueue2 = new LinkedList<>(Arrays.asList(cards2));

        for (String s : goal) {
            if (s.equals(cardQueue1.peek())) stringList.add(cardQueue1.poll());
            else if (s.equals(cardQueue2.peek())) stringList.add(cardQueue2.poll());
            else break;
        }
        answer = Arrays.equals(goal, stringList.toArray()) ? "Yes" : "No";
        return answer;
    }
}