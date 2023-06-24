class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        if (my_str.length() % n == 0) {
            answer = new String[my_str.length() / n];
            String tempString = my_str;
            for (int i = 0; i < my_str.length() / n; i++) {
                String s = "";
                for (int j = 0; j < n; j++) {
                    if (tempString.length() < n) answer[i] = tempString;
                    else s += tempString.charAt(j);
                }
                answer[i] = s;
                if (tempString.length() < n) answer[i] = tempString;
                else tempString = tempString.substring(n);
            }
        } else {
            answer = new String[my_str.length() / n + 1];
            String tempString = my_str;
            for (int i = 0; i < my_str.length() / n + 1; i++) {
                String s = "";
                for (int j = 0; j < n; j++) {
                    if (tempString.length() < n) answer[i] = tempString;
                    else s += tempString.charAt(j);
                }
                answer[i] = s;
                if (tempString.length() < n) answer[i] = tempString;
                else tempString = tempString.substring(n);
            }

        }
        return answer;
    }
}