class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int[] numberArray = new int[Integer.toString(num).length()];
        for (int i = Integer.toString(num).length() - 1; i >= 0; i--) {
            numberArray[i] = num % 10;
            num /= 10;
        }
        for (int j = 0; j < numberArray.length; j++) {
            if (numberArray[j] == k) {
                answer = j + 1;
                break;
            }
            else answer = -1;
        }
        return answer;
    }
}