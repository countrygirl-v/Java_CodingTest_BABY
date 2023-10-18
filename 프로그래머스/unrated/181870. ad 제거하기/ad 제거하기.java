import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> stringList = new ArrayList<>(Arrays.stream(strArr).collect(Collectors.toList()));
        for (String str : strArr) {
            if (str.contains("ad")) stringList.remove(str);
        }
        return stringList.toArray(new String[0]);
    }
}