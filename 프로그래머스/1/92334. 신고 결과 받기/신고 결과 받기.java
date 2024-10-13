import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        List<String> reportList = Arrays.stream(report).distinct().collect(Collectors.toList());
        int[] answer = new int[id_list.length];

        List<String> list = reportList.stream()
                .map(s -> s.split(" ")[1])
                .collect(Collectors.toList()).stream()
                .collect(Collectors.groupingBy(target -> target, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() >= k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        HashMap<String, HashSet<String>> reportMap = new HashMap<>();

        for (String s : reportList) {
            String source = s.split(" ")[0];
            String target = s.split(" ")[1];

            reportMap.putIfAbsent(source, new HashSet<>());
            reportMap.get(source).add(target);
        }

        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            if (reportMap.containsKey(id)) {
                for (String target : reportMap.get(id)) {
                    if (list.contains(target)) {
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }
}