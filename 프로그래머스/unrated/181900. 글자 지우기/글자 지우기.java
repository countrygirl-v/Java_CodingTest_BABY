import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strings = my_string.split("");
        for (int index : indices) strings[index] = "";
        return String.join("", strings);
    }
}