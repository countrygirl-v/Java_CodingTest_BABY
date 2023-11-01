import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        for (String term : terms) {
            for (int j = 0; j < privacies.length; j++) {
                int period = Integer.parseInt(String.valueOf(term.split(" ")[1]));
                String[] date = privacies[j].split(" ")[0].split("\\.");
                if (term.charAt(0) == privacies[j].charAt(privacies[j].length() - 1)) {
                    int year = period / 12;
                    int remain = period % 12;
                    date[0] = String.valueOf(Integer.parseInt(date[0]) + year);
                    date[1] = String.valueOf(Integer.parseInt(date[1]) + remain);
                    if (Integer.parseInt(date[1]) > 12) {
                        if (date[2].equals("01")) {
                            date[0] = String.valueOf(Integer.parseInt(date[0]) + 1);
                            date[1] = String.valueOf(Integer.parseInt(date[1]) - 13);
                            date[2] = "28";
                        } else {
                            date[0] = String.valueOf(Integer.parseInt(date[0]) + 1);
                            date[1] = String.valueOf(Integer.parseInt(date[1]) - 12);
                            date[2] = String.valueOf(Integer.parseInt(date[2]) - 1);
                        }
                    } else {
                        if (date[2].equals("01")) {
                            date[1] = String.valueOf(Integer.parseInt(date[1]) - 1);
                            date[2] = "28";
                        } else {
                            date[2] = String.valueOf(Integer.parseInt(date[2]) - 1);
                        }
                    }
                    if (Integer.parseInt(date[1]) < 10) {
                        date[1] = "0" + Integer.parseInt(date[1]);
                    }
                    if (Integer.parseInt(date[2]) < 10) {
                        date[2] = "0" + Integer.parseInt(date[2]);
                    }
                    StringBuilder dateString = new StringBuilder();
                    for (String s : date) {
                        dateString.append(s);
                    }
                    if (Integer.parseInt(today.replace(".", "")) > Integer.parseInt(dateString.toString()))
                        answer.add(j + 1);
                }
            }
            Collections.sort(answer);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}