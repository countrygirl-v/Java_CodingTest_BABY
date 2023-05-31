class Solution {
    public String solution(int age) {
        String strAge = "";
        strAge += age;
        char[] chAge = new char[strAge.length()];

        for (int i = 0; i < strAge.length(); i++) chAge[i] += (int)(strAge.charAt(i) + 49);
        String answer = new String(chAge);
        return answer;
    }
}