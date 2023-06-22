class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        int[] array = new int[right - left + 1];
        int[] primeCount = new int[right - left + 1];
        int j = 0;
        for (int i = left; i < right + 1; i++) {
            array[j] = i;
            j++;
        }

        for (int i = 0; i < array.length; i++) {
            for (int k = 1; k < right + 1; k++) {
                if (array[i] % k == 0) primeCount[i]++;
            }
        }
        for (int i = 0; i < primeCount.length; i++) {
            if (primeCount[i] % 2 == 0) answer += array[i];
            else answer -= array[i];
        }
        
        return answer;
    }
}