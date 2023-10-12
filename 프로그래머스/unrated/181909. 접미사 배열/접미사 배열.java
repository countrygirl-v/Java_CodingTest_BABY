import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        Collections.sort(list);
        System.out.println("list = " + list);
        return list.toArray(new String[my_string.length()]);
    }
}