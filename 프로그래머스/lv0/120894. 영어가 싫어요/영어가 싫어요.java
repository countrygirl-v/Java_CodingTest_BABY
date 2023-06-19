class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] engArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < numArray.length; i++) numbers = numbers.replaceAll(engArray[i], numArray[i]);
        answer = Long.parseLong(numbers);
        return answer;
    }
}