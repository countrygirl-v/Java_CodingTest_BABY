class Solution {
    public int solution(String[] babbling) {
        String[] baby = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        String[] check = new String[8];

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < baby.length; j++) {
                babbling[i] = babbling[i].replace(baby[j], "#");
            }
            for (int j = 0; j < 8; j++) {
                check[j] = "#".repeat(j + 1);
            }
            for (int j = 0; j < check.length; j++) {
                if (babbling[i].equals(check[j])) answer++;
            }
        }
        
        return answer;
    }
}