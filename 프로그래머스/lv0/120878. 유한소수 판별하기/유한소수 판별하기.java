import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int max = Math.max(a, b);

        for (int i = 2; i < max; i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
   
        List<Integer> factorArrayList = new ArrayList<>();

        for (int i = 2; i <= b; i++) {
            while (b % i == 0) {
                if (!factorArrayList.contains(i)) factorArrayList.add(i);
                b /= i;
            }
        }
        
        boolean onlyContainsTwoOrFive = true;
        for (int num : factorArrayList) {
            if (num != 2 && num != 5) {
                onlyContainsTwoOrFive = false;
                break;
            }
        }

        answer = onlyContainsTwoOrFive ? 1 : 2;
        return answer;
    }
}