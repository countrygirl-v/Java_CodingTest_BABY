class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;

        for (int i = 1; i < dots.length; i++) {
            int j = 0;
            if (dots[i][0] == dots[j][0]) height = Math.abs(dots[i][1] - dots[j][1]);
            if (dots[i][1] == dots[j][1]) width = Math.abs(dots[i][0] - dots[j][0]);
            j++;
        }
        answer = width * height;
        return answer;
    }
}