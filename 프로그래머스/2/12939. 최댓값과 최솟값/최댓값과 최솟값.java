import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        List<Integer> integers = new ArrayList<>();

        for (String s1 : list) {
            integers.add(Integer.parseInt(s1));
        }
        return Collections.min(integers) + " " + Collections.max(integers);
    }
}