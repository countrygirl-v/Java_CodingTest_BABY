import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String dartResult) {
        List<String> list = new ArrayList<>(Arrays.asList(dartResult.split("(?<=\\D)|(?=\\D)")));
        List<String> temp = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).matches("\\d+")) {
                temp.add(list.get(i));
            } else {
                if (!list.get(i).matches("\\d+")) {
                    switch (list.get(i)) {
                        case "S" -> temp.add("S");
                        case "D" -> temp.add("D");
                        case "T" -> temp.add("T");
                    }
                }
                if (list.get(i).equals("*") && i == 2) temp.add("*2");
                else if (list.get(i).equals("*")) {
                    temp.add("*2");
                    temp.add(i - 2, "*2");
                }
                if (list.get(i).equals("#")) temp.add("*(-1)");
            }
        }

        for (String value : temp) {
            int s = answerList.size() - 1;
            if (value.matches("\\d+")) {
                answerList.add(Integer.parseInt(value));
            } else {
                switch (value) {
                    case "S" -> answerList.set(s, Integer.parseInt(String.valueOf(answerList.get(s))));
                    case "D" -> answerList.set(s, (int) Math.pow(answerList.get(s), 2));
                    case "T" -> answerList.set(s, (int) Math.pow(answerList.get(s), 3));
                }
                if (value.startsWith("*")) {
                    switch (value) {
                        case "*2" -> answerList.set(s, answerList.get(s) * 2);
                        case "*(-1)" -> answerList.set(s, answerList.get(s) * (-1));
                    }
                }
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).sum();
    }
}