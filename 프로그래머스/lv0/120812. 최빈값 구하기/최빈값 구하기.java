class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] elementArray = new int[1000];
        int mode = 0;
        int modeIndex = 0;
        int lengthCheck = 0;

        for (int i=0; i<array.length; i++) elementArray[array[i]]++;

        for (int j = 0; j < elementArray.length; j++){
            if(elementArray[j] > mode) {
                mode = elementArray[j];
                modeIndex = j;
            }
        }
        for (int k = 0; k < elementArray.length; k++){
            if(elementArray[k] == mode) lengthCheck++;
            }
        if (lengthCheck > 1) answer = -1;
        else answer = modeIndex;
        return answer;
    }
}