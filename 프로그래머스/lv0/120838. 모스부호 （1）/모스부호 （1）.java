class Solution {
    public String solution(String letter) {
        String[] strLetter = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        char[] chMorse = new char[strLetter.length];

        for (int i = 0; i < strLetter.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if(strLetter[i].equals(morse[j])) {
                    chMorse[i] = (char)(j + 97);    // 정수 -> 문자로 강제 형변환
                }
            }
        }
        String answer = new String(chMorse);
        return answer;
    }
}