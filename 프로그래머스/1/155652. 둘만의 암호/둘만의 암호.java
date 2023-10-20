import java.util.Stack;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.charAt(i); characterStack.size() != index + 1; j++) {
                if (j > 122) {
                    j = j % 122 + 96;
                    characterStack.push((char) j);
                    for (char c : skip.toCharArray()) {
                        if (characterStack.peek().equals(c)) {
                            characterStack.pop();
                        }
                    }
                } else {
                    characterStack.push((char) j);
                    for (char c : skip.toCharArray()) {
                        if (characterStack.peek().equals(c)) {
                            characterStack.pop();
                        }
                    }
                }
            }
            sb.append(characterStack.pop());
            characterStack.clear();
        }
        return sb.toString();
    }
}