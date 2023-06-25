import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) arrayList.add(i);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (answer[0] < arrayList.get(i)) answer[0] = arrayList.get(i);
        }
        answer[1] = m * n / answer[0]; 
        return answer;
    }
}