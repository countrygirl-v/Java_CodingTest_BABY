class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        int[] diffAbsArray = new int[array.length];

        for (int i = 0; i < array.length; i++) diffAbsArray[i] = Math.abs(array[i] - n);
        for (int i = 0; i < array.length; i++) {
            if (diffAbsArray[i] < min) {
                min = diffAbsArray[i];
                answer = array[i];
            }
            for (int j = 0; j < diffAbsArray.length; j++) {
                if (answer == array[i] && diffAbsArray[i] == diffAbsArray[j]) answer = Math.min(array[i], array[j]);
            }
        }
        return answer;
    }
}