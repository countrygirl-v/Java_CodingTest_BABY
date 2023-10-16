import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>(Arrays.stream(lost).boxed().collect(Collectors.toList()));
        List<Integer> reserveList = new ArrayList<>(Arrays.stream(reserve).boxed().collect(Collectors.toList()));
        Map<Integer, Integer> map = new HashMap<>();
        Collections.sort(lostList);
        Collections.sort(reserveList);
        for (int i : lost) {
            for (int j : reserve) {
                if (i==j) map.put(i,j);
            }
        }
        for (Integer key : map.keySet()) {
            lostList.remove(key);
            reserveList.remove(key);
        }

        for (Integer i : lostList) {
            for (Integer j : reserveList) {
                if (Math.abs(i-j)==1) {
                    map.put(i,j);
                    reserveList.remove(j);
                    break;
                }
            }
        }
        return n - lost.length + map.size();
    }
}