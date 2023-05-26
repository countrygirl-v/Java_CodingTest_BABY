import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i < my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))) arrayList.add((int) my_string.charAt(i) - 48);
        }
        Collections.sort(arrayList);
        int[] answer = new int[arrayList.size()];
        int i = 0;
        for(int num : arrayList) answer[i++] += num;
        
        return answer;
    }
}