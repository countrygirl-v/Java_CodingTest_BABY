class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sumPrice = 0;
        for (int i = 1; i < count + 1; i++) {
            sumPrice += price * i;
        }
        answer = (sumPrice - money >= 0) ? (sumPrice - money) : 0;

        return answer;
    }
}