import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 1; i < n + 1 ; i++){
            if (n % i == 0) arrayList.add(i);
        }
        int []answer = new int[arrayList.size()];
        int i = 0;
        for(int divisor : arrayList) answer[i++] = divisor;
        return answer;
    }
}