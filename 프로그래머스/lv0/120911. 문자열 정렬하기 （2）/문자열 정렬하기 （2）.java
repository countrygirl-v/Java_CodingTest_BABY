import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] ch = my_string.toCharArray();
        Arrays.sort(ch);
        Arrays.toString(ch);
        String answer = new String(ch);
        System.out.println(answer);
        return answer;
    }
}