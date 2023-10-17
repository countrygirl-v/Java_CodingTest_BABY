import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] names) {
        return IntStream.range(0, names.length)
                    .filter(i -> i % 5 == 0).mapToObj(i -> names[i])
                    .collect(Collectors.toList())
                    .toArray(new String[0]);
    }
}