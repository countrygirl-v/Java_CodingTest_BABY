class Solution {
    public String solution(String s) {
        String answer = "";
        String[] stringArray = s.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            String word = "";
            for (int j = 0; j < stringArray[i].length(); j++) {
                if (j % 2 == 0) word += Character.toUpperCase(stringArray[i].charAt(j));
                else word += Character.toLowerCase(stringArray[i].charAt(j));
            }
            if (i == stringArray.length - 1) answer += word;
            else answer += word + " ";
        }
        int spaceNum = s.length() - answer.length();
        return answer + " ".repeat(spaceNum);
    }
}