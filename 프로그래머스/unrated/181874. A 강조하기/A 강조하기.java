import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String myString) {
        List<String> stringList = new ArrayList<>(Arrays.asList(myString.split("")));
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals("a") || stringList.get(i).equals("A")) stringList.set(i, "A");
            else if ((!stringList.get(i).equals("a")) && Character.isUpperCase(stringList.get(i).charAt(0))) stringList.set(i, stringList.get(i).toLowerCase());
        }
        return String.join("", stringList);
    }
}