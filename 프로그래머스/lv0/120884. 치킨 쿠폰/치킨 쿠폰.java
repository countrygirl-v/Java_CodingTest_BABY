class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int service = 0;

        while (coupon >= 10) {
            service = coupon / 10;
            answer += service;
            coupon = coupon % 10 + service;
        }
        return answer;
    }
}