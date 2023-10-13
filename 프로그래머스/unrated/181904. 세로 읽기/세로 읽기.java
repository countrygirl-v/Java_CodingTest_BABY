class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        char[][] chars = new char[my_string.length() / m][m];
        for (int i = 0; i < my_string.length() / m; i++) {
            for (int j = 0; j < m; j++) {
                chars[i][j] = my_string.charAt(j + i * m);
            }
            answer.append(chars[i][c - 1]);
        }
        return answer.toString();
    }
}