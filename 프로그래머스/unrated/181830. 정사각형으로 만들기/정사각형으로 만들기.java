class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = new int[Math.max(arr.length, arr[0].length)][Math.max(arr.length, arr[0].length)];
        if (arr.length == arr[0].length) return arr;
        else if (arr.length > arr[0].length) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (j < arr[0].length) answer[i][j] = arr[i][j];
                    else answer[i][j] = 0;
                }
            }
        } else {
            for (int i = 0; i < arr[0].length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (i < arr.length) answer[i][j] = arr[i][j];
                    else answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}