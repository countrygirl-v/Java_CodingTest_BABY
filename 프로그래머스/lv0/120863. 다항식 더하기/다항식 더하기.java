import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] polySplit = polynomial.split(" ");
        int variable = 0;
        int constant = 0;
        List<String> variableList = new ArrayList<>();
        List<String> constantList = new ArrayList<>();
        for (String s : polySplit) {
            if(s.contains("x")) variableList.add(s);
            if(!s.contains("x")) constantList.add(s);
            constantList.remove("+");
        }
        for (String s : variableList) {
            variable += s.length() > 1 ? Integer.parseInt(s.substring(0, s.length() -1)) : 1;
        }

        for (String s : constantList) constant += Integer.parseInt(s);
        if (variable > 1 && constant > 0) answer = variable + "x" + " + " + constant;
        else if (variable == 1 && constant > 0) answer = "x" + " + " + constant;
        else if (variable == 1 && constant == 0) answer = "x";
        else if (variable == 0 && constant > 0) answer = Integer.toString(constant);
        else if (variable > 0 && constant == 0) answer = variable + "x";
        return answer;
    }
}