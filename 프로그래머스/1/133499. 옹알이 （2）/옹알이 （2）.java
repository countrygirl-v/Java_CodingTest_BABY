class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < baby.length; j++) {
                if (babbling[i].contains(baby[j]+baby[j])) babbling[i] = babbling[i].replace(babbling[i], "");
            }
        }

        for (int i = 0; i < babbling.length; i++) {
            for (String s : baby) {
                babbling[i] = babbling[i].replace(s, "#");
            }
            if (babbling[i].matches("^#+$")) answer++;
        }

        return answer;
    }
}