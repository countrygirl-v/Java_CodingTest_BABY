import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        List<Integer> line1 = new ArrayList<>();
        List<Integer> line2 = new ArrayList<>();
        List<Integer> line3 = new ArrayList<>();

        for (int i = lines[0][0]; i <= lines[0][1]; i++) {
            line1.add(i);
        }
        for (int i = lines[1][0]; i <= lines[1][1]; i++) {
            line2.add(i);
        }
        for (int i = lines[2][0]; i <= lines[2][1]; i++) {
            line3.add(i);
        }
        
        List<Integer> overlapLine1 = new ArrayList<>();
        List<Integer> overlapLine2 = new ArrayList<>();
        List<Integer> overlapLine3 = new ArrayList<>();


        for (int i = 0; i < line1.size(); i++) {
            for (int j = 0; j < line2.size(); j++) {
                if(line1.get(i).equals(line2.get(j))) overlapLine1.add(line2.get(j));
            }
        }
        for (int i = 0; i < line2.size(); i++) {
            for (int j = 0; j < line3.size(); j++) {
                if(line2.get(i).equals(line3.get(j))) overlapLine2.add(line3.get(j));
            }
        }
        for (int i = 0; i < line1.size(); i++) {
            for (int j = 0; j < line3.size(); j++) {
                if(line1.get(i).equals(line3.get(j))) overlapLine3.add(line3.get(j));
            }
        }

        answer += overlapLine1.size() == 0 ? 0 : overlapLine1.get(overlapLine1.size() - 1) - overlapLine1.get(0);
        answer += overlapLine2.size() == 0 ? 0 : overlapLine2.get(overlapLine2.size() - 1) - overlapLine2.get(0);
        answer += overlapLine3.size() == 0 ? 0 : overlapLine3.get(overlapLine3.size() - 1) - overlapLine3.get(0);
        
        int min = 0;
        int max = 0;
        if(!(overlapLine1.size() == 0 || overlapLine2.size() == 0 || overlapLine3.size() == 0)) {
            if(overlapLine1.get(0) > overlapLine2.get(0)) min = overlapLine2.get(0);
            if (overlapLine2.get(0) > overlapLine3.get(0)) min = overlapLine3.get(0);
            if (overlapLine3.get(0) > overlapLine1.get(0)) min = overlapLine1.get(0);

            if(overlapLine1.get(overlapLine1.size() - 1) > overlapLine2.get(overlapLine2.size() - 1)) max = overlapLine1.get(overlapLine1.size() - 1);
            if (overlapLine2.get(overlapLine2.size() - 1) > overlapLine3.get(overlapLine3.size() - 1)) max = overlapLine2.get(overlapLine2.size() - 1);
            if (overlapLine3.get(overlapLine3.size() - 1) > overlapLine1.get(overlapLine1.size() - 1)) max = overlapLine3.get(overlapLine3.size() - 1);

            answer = max - min;
        }
        
        if(lines[0][0] == lines[1][0] && lines[1][0] == lines[2][0] && lines[0][1] == lines[1][1] && lines[1][1] == lines[2][1]) answer = lines[0][1] - lines[0][0];
        
        return answer;
    }
}