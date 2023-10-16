import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                answer.addAll(Arrays.asList(str_list).subList(0, i));
                break;
            }
            else if (str_list[i].equals("r")) {
                answer.addAll(Arrays.asList(str_list).subList(i + 1, str_list.length));
                break;
            }
        }
        return answer.toArray(new String[0]);
    }
}