class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] split = s.split("(?<=.)(?= )|(?<= )(?=.)");
        for (String string : split) {
            if (!string.matches("\\s")) {
                for (int i = 0; i < string.length(); i++) {
                    if (i == 0 && (Character.isDigit(string.charAt(i)) || Character.isUpperCase(string.charAt(i)))) {
                        string = string.charAt(0) + string.substring(1).toLowerCase();
                    } else if (i == 0 && !Character.isDigit(string.charAt(i)) && Character.isLowerCase(string.charAt(i))) {
                        string = String.valueOf(string.charAt(0)).toUpperCase() + string.substring(1).toLowerCase();
                    }
                }
            }
            answer.append(string);
        }
        return answer.toString();
    }
}