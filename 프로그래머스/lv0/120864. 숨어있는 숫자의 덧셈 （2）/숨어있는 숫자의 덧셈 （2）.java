class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strings = my_string.split("[a-zA-z]");
        for (String s : strings) if (!s.equals("")) answer += Integer.parseInt(s);
        return answer;
    }
}