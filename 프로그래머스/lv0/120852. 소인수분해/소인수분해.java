import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> factorArrayList = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                if(!factorArrayList.contains(i)) factorArrayList.add(i);
                n /= i;
            }
        }
        int[] answer = new int[factorArrayList.size()];
        for (int j = 0; j < factorArrayList.size(); j++) answer[j] = factorArrayList.get(j);

        return answer;
    }
}