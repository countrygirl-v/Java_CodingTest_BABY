import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(0, i + 1));
        }        
        for (String s : list) {
            if (s.equals(is_prefix)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}