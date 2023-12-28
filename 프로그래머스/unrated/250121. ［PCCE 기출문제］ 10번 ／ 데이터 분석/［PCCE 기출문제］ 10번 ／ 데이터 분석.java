import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = new int[data.length][data[0].length];
            List<int[]> answerList = new ArrayList<>();
            int sortStandard = switch (sort_by) {
                case "date" -> 1;
                case "maximum" -> 2;
                case "remain" -> 3;
                default -> 0;
            };
            switch (ext) {
                case "code" -> {
                    for (int[] datum : data) {
                        if (datum[0] < val_ext) {
                            answerList.add(datum);
                        }
                    }
                    answerList.sort(Comparator.comparingInt(a -> a[sortStandard]));
                }
                case "date" -> {
                    for (int[] datum : data) {
                        if (datum[1] < val_ext) {
                            answerList.add(datum);
                        }
                    }
                    answerList.sort(Comparator.comparingInt(a -> a[sortStandard]));
                }
                case "maximum" -> {
                    for (int[] datum : data) {
                        if (datum[2] < val_ext) {
                            answerList.add(datum);
                        }
                    }
                    answerList.sort(Comparator.comparingInt(a -> a[sortStandard]));
                }
                case "remain" -> {
                    for (int[] datum : data) {
                        if (datum[3] < val_ext) {
                            answerList.add(datum);
                        }
                    }
                    answerList.sort(Comparator.comparingInt(a -> a[sortStandard]));
                }
            }
            return answerList.toArray(new int[0][]);
    }
}