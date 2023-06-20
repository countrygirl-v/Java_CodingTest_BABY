import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int guessNumberCount = 0;
        int zeroCount = 0;
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) guessNumberCount++;
            }
            if (lottos[i] == 0) zeroCount++;
        }
        
        if (zeroCount == 6) {
            answer[0] = 7 - zeroCount;
            answer[1] = 6;

        } else if (guessNumberCount == 0 && zeroCount == 0) {
            answer[0] = 6;
            answer[1] = 6;
        } else {
            answer[0] = 7 - guessNumberCount - zeroCount;
            answer[1] = 7 - guessNumberCount;
        }
        return answer;
    }
}