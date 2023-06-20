import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] guessNumber = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) guessNumber[0]++;
            if (answers[i] == person2[i % person2.length]) guessNumber[1]++;
            if (answers[i] == person3[i % person3.length]) guessNumber[2]++;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (guessNumber[0] >= guessNumber[1] && guessNumber[0] >= guessNumber[2]) arrayList.add(1);
        if (guessNumber[1] >= guessNumber[0] && guessNumber[1] >= guessNumber[2]) arrayList.add(2);
        if (guessNumber[2] >= guessNumber[0] && guessNumber[2] >= guessNumber[1]) arrayList.add(3);

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) answer[i] = arrayList.get(i);
        return answer;
    }
}