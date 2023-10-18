import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                for (int k = 0; k < keymap.length; k++) {
                    if (keymap[k].contains(String.valueOf(targets[i].charAt(j)))) {
                        list.add(keymap[k].indexOf(String.valueOf(targets[i].charAt(j))) + 1);
                    } else list.add(-1);
                }
                temp.add(list.stream().filter(l -> l > 0).min(Integer::compareTo).orElse(-1));

                list.clear();
            }
            if (!temp.contains(-1)) answer.add(temp.stream().mapToInt(Integer::intValue).sum());
            else answer.add(-1);
            temp.clear();
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}