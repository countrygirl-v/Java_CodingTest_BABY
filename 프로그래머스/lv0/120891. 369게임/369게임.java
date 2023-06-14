class Solution {
    public int solution(int order) {
        int answer = 0;
        int number = 0;
        while (order > 0) {
            number = order % 10;
            order /= 10;
            if(number == 3 || number == 6 || number == 9) answer++;
        }
        return answer;
    }
}