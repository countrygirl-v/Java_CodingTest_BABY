class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        long totalNumbers = 0;
        for(int i = 0; i < numbers.length; i++){
            totalNumbers += numbers[i];
        }
        answer = (double)totalNumbers / numbers.length;
        return answer;
    }
}