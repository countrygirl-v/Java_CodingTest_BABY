import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] splitNum = (n + "").split("");
        Arrays.sort(splitNum, Collections.reverseOrder());
        String result = "";
        for (int i = 0; i < splitNum.length; i++) result += splitNum[i];
        return Long.parseLong(result);
    }
}