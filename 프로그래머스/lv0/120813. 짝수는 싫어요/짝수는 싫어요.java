import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < n + 1; i++) if(i % 2 != 0) arrayList.add(i);
        int[] answer = new int[arrayList.size()];
        int j = 0;
        for(int odd : arrayList) answer[j++] += odd;
        
        return answer;
    }
}