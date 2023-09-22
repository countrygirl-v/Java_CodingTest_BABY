import java.util.Arrays;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String[] splitA = A.split("");
        String[] splitB = B.split("");
        
        if (Arrays.equals(splitA, splitB)) answer = 0;
        else {
            for (int j = 0; j < A.length(); j++) {
                String temp = splitA[A.length() - 1];
                for (int i = A.length() - 1; i > 0; i--) {
                    splitA[i] = splitA[i - 1];
                }
                splitA[0] = temp;
                answer++;
                if (Arrays.equals(splitA, splitB)) break;
            }
            if (!Arrays.equals(splitA, splitB)) answer = -1;
        }
        return answer;
    }
}