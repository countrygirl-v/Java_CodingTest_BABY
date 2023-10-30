import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        String[] types = {"R", "T", "C", "F", "J", "M", "A", "N"};
        Map<Integer, Integer> scoreMap = new LinkedHashMap<>();
        scoreMap.put(1, 3);
        scoreMap.put(2, 2);
        scoreMap.put(3, 1);
        scoreMap.put(4, 0);
        scoreMap.put(5, 1);
        scoreMap.put(6, 2);
        scoreMap.put(7, 3);
        System.out.println("scoreMap = " + scoreMap);
        Map<String, Integer> typeMap = new LinkedHashMap<>();
        for (String type : types) {
            typeMap.put(type, 0);
        }
        System.out.println("typeMap = " + typeMap);
        Map<String, Integer> surveyMap = new LinkedHashMap<>();

        for (int i = 0; i < survey.length; i++) {
            surveyMap.put(survey[i], choices[i]);
        }
        System.out.println("surveyMap = " + surveyMap);
        for (int i = 0; i < survey.length; i++) {
            if (survey[i].equals("RT")) {
                if (choices[i] < 4) typeMap.put("R", typeMap.get("R") + scoreMap.get(choices[i]));
                else if (choices[i] > 4) typeMap.put("T", typeMap.get("T") + scoreMap.get(choices[i]));
            } else if (survey[i].equals("TR")) {
                if (choices[i] < 4) typeMap.put("T", typeMap.get("T") + scoreMap.get(choices[i]));
                else if (choices[i] > 4) typeMap.put("R", typeMap.get("R") + scoreMap.get(choices[i]));
            } else if (survey[i].equals("CF")) {
                if (choices[i] < 4) typeMap.put("C", typeMap.get("C") + scoreMap.get(choices[i]));
                else if (choices[i] > 4) typeMap.put("F", typeMap.get("F") + scoreMap.get(choices[i]));
            } else if (survey[i].equals("FC")) {
                if (choices[i] < 4) typeMap.put("F", typeMap.get("F") + scoreMap.get(choices[i]));
                else if (choices[i] > 4) typeMap.put("C", typeMap.get("C") + scoreMap.get(choices[i]));
            } else if (survey[i].equals("JM")) {
                if (choices[i] < 4) typeMap.put("J", typeMap.get("J") + scoreMap.get(choices[i]));
                else if (choices[i] > 4) typeMap.put("M", typeMap.get("M") + scoreMap.get(choices[i]));
            } else if (survey[i].equals("MJ")) {
                if (choices[i] < 4) typeMap.put("M", typeMap.get("M") + scoreMap.get(choices[i]));
                else if (choices[i] > 4) typeMap.put("J", typeMap.get("J") + scoreMap.get(choices[i]));
            } else if (survey[i].equals("AN")) {
                if (choices[i] < 4) typeMap.put("A", typeMap.get("A") + scoreMap.get(choices[i]));
                else if (choices[i] > 4) typeMap.put("N", typeMap.get("N") + scoreMap.get(choices[i]));
            } else if (survey[i].equals("NA")) {
                if (choices[i] < 4) typeMap.put("N", typeMap.get("N") + scoreMap.get(choices[i]));
                else if (choices[i] > 4) typeMap.put("A", typeMap.get("A") + scoreMap.get(choices[i]));
            }
        }
        System.out.println("typeMap = " + typeMap);
        if (typeMap.get("R") > typeMap.get("T")) answer.append("R");
        else if (typeMap.get("R") < typeMap.get("T")) answer.append("T");
        else {
            if ('R' > 'T') answer.append("T");
            else answer.append("R");
        }
        if (typeMap.get("C") > typeMap.get("F")) answer.append("C");
        else if (typeMap.get("C") < typeMap.get("F")) answer.append("F");
        else {
            if ('C' > 'F') answer.append("F");
            else answer.append("C");
        }
        if (typeMap.get("J") > typeMap.get("M")) answer.append("J");
        else if (typeMap.get("J") < typeMap.get("M")) answer.append("M");
        else {
            if ('J' > 'M') answer.append("M");
            else answer.append("J");
        }
        if (typeMap.get("A") > typeMap.get("N")) answer.append("A");
        else if (typeMap.get("A") < typeMap.get("N")) answer.append("N");
        else {
            if ('A' > 'N') answer.append("N");
            else answer.append("A");
        }

        return answer.toString();
    }
}