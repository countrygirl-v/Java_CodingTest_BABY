import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> numberList = new ArrayList<>(Arrays.asList(a, b, c, d));
        
        for (Integer integer : numberList) {
            if (!map.containsKey(integer)) map.put(integer, 1);
            else map.put(integer, map.get(integer) + 1);
        }
        
        if (map.size() == 2) {
            if (map.values().toArray()[0] == map.values().toArray()[1]) {
                return ((int) map.keySet().toArray()[0] + (int) map.keySet().toArray()[1]) * (Math.abs((int) map.keySet().toArray()[0] - (int) map.keySet().toArray()[1]));
            } else {
                int p = 0;
                int q = 0;
                for (Integer key : map.keySet()) {
                    if (map.get(key) == 3) p = key;
                    if (map.get(key) == 1) q = key;
                }
                return (int) Math.pow(10 * p + q, 2);
            }
        } else if (map.size() == 1) return a * 1111;
        else if (map.size() == 4)
            return Math.min(Math.min(a, b), Math.min(c, d));
        else {
            List<Integer> tempList = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) tempList.add(entry.getKey());
            }
            return tempList.get(0) * tempList.get(1);
        }
    }
}