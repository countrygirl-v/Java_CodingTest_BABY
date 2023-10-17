import java.util.*;

class Solution {
    public int solution(String s) {
        Queue<String> stringQueue = new LinkedList<>(Arrays.asList(s.split("")));
        List<String> stringList = new ArrayList<>(Arrays.asList(s.split("")));
        List<String> otherStringList = new ArrayList<>();
        List<String> firstStringList = new ArrayList<>();
        List<String> answer = new ArrayList<>();
        String firstString = null;
        for (String string : stringList) {
            if (firstStringList.size() == otherStringList.size()) {
                firstString = stringQueue.peek();
                answer.add(firstString);
            }
            if (firstString.equals(stringQueue.peek())) {
                firstStringList.add(stringQueue.poll());
            } else {
                otherStringList.add(stringQueue.poll());
            }
            if (stringQueue.isEmpty()) break;
        }
        return answer.size();
    }
}