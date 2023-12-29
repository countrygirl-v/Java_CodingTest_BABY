import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int sortStandard = switch (sort_by) {
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        int extIndex = switch (ext) {
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        List<int[]> answerList = Arrays.stream(data)
                .filter(datum -> datum[extIndex] < val_ext)
                .sorted(Comparator.comparingInt(a -> a[sortStandard]))
                .collect(Collectors.toList());

        return answerList.toArray(new int[0][]);
    }
}