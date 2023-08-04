class Solution {
    public int solution(int[] sides) {
        int i = 0;
        int answer = 0;
        while (true) {
            int maxSide = Math.max(sides[0], sides[1]);
            int minSide = Math.min(sides[0], sides[1]);
            if (minSide + i > maxSide) answer++;
            if (i > maxSide + maxSide) answer++;
            i++;
            if (minSide + maxSide <= i) break;
        }
        return answer;
    }
}