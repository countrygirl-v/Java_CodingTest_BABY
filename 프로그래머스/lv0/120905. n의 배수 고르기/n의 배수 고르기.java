import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) arrayList.add(numlist[i]);
        }
        answer = new int[arrayList.size()];
        int i = 0;
        for(int num : arrayList) answer[i++] += num;
        
        return answer;
    }
}