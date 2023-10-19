import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        List<String> xSplit = new ArrayList<>(Arrays.asList(myString.split("x")));
        xSplit.removeIf(s -> s.length() == 0);
        Collections.sort(xSplit);
        return xSplit.toArray(new String[0]);
    }
}