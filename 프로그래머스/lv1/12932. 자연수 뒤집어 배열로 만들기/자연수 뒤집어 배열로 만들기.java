class Solution {
    public int[] solution(long n) {
        String[] numberArray = (n + "").split("");
        int[] answer = new int[numberArray.length];

        for (int i = numberArray.length - 1; i >= 0 ; i--) answer[numberArray.length -1 - i] = Integer.parseInt(numberArray[i]);
        
        return answer;
    }
}