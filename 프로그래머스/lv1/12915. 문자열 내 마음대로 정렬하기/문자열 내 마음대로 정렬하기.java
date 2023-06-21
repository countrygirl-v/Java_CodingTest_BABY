import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) arrayList.add(strings[i].charAt(n) + strings[i]);
        Collections.sort(arrayList);

        String[] answer = new String[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) answer[i] = arrayList.get(i).substring(1);
        
        return answer;
    }
}