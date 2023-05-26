class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int lambPrice = 12000 * n;
        int drinkPrice = 2000 * k;
        int drinkDiscount = n / 10;
        
        answer = lambPrice + drinkPrice - 2000 * drinkDiscount;        
        
        return answer;
    }
}