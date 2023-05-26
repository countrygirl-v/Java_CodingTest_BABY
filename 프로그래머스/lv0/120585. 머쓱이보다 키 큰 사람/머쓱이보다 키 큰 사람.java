import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++) arrayList.add(array[i]);
        arrayList.add(height);
        Collections.sort(arrayList);
        for(int j= 0; j < array.length; j++){
            if(array[j] > height) answer++;
        }
        return answer;
    }
}