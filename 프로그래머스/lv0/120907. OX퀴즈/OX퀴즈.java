class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] quizSplit;

        for (int i = 0; i < quiz.length; i++) {
            quizSplit = quiz[i].split(" ");
            int result = Integer.parseInt(quizSplit[0]);
            switch (quizSplit[1]) {
                case "+" -> result += Integer.parseInt(quizSplit[2]);
                case "-" -> result -= Integer.parseInt(quizSplit[2]);
            }
            if (result == Integer.parseInt(quizSplit[4])) answer[i] = "O";
            else answer[i] = "X";
        }
        return answer;
    }
}