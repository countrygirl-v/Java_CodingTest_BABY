import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        List<String> split = new ArrayList<>(Arrays.asList(myStr.split("[abc]")));
        split.removeIf(s -> s.length() == 0);
        if (split.size() == 0) return new String[] {"EMPTY"};
        return split.toArray(new String[0]);
    }
}