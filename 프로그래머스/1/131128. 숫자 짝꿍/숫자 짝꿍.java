import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();
        Map<String, Integer> commonMap = new HashMap<>();
        StringBuilder temp = new StringBuilder();
        for (String s : X.split("")) {
            xMap.put(s, xMap.getOrDefault(s, 0) + 1);
        }
        for (String s : Y.split("")) {
            yMap.put(s, yMap.getOrDefault(s, 0) + 1);
        }
        for (String x : xMap.keySet()) {
            if (yMap.containsKey(x))
                commonMap.put(x, Math.min(xMap.get(x), yMap.get(x)));
        }
        for (String s : commonMap.keySet()) {
            temp.append(s.repeat(commonMap.get(s)));
        }
        List<String> answer = new ArrayList<>(Arrays.asList(temp.toString().split("")));
        answer.sort(Collections.reverseOrder());
        if (commonMap.isEmpty()) return "-1";
        if (commonMap.containsKey("0") && commonMap.size() == 1) return "0";

        return String.join("", answer);
    }
}