import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (n >= 3) {
            list.add(n % 3);
            n /= 3;
        }
        list.add(n);
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(3, list.size() - 1 - i);
        }
        return answer;
    }
}