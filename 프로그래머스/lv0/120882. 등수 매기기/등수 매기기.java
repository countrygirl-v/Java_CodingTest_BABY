class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        float[] avgs = new float[score.length];
        for (int i = 0; i < score.length; i++) {
            avgs[i] = (float) (score[i][0] + score[i][1]) / 2;
        }
        for (int i = 0; i < score.length; i++) {
            int temp = 1;
            for (int j = 0; j < score.length; j++) {
                if (avgs[i] < avgs[j]) temp++;
                answer[i] = temp;
            }
        }
        return answer;
    }
}