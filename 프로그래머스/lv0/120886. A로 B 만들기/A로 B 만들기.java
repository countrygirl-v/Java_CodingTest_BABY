import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] charBefore = before.toCharArray();
        char[] charAfter = after.toCharArray();
        
        Arrays.sort(charBefore);
        String sortBefore = new String(charBefore);
        
        Arrays.sort(charAfter);
        String sortAfter = new String(charAfter);
        
        if(sortAfter.equals(sortBefore)) answer = 1;
        else answer = 0;
        return answer;
    }
}