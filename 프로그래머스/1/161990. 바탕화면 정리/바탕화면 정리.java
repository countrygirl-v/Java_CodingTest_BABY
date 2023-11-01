class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE,
                maxX = Integer.MIN_VALUE,
                minY = Integer.MAX_VALUE,
                maxY = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (minX > j) minX = j;
                    if (maxX < j) maxX = j;
                    if (minY > i) minY = i;
                    if (maxY < i) maxY = i;
                }
            }
        }
        int[] answer = new int[4];
        answer[0] = minY;
        answer[1] = minX;
        answer[2] = maxY + 1;
        answer[3] = maxX + 1;
        return answer;
    }
}