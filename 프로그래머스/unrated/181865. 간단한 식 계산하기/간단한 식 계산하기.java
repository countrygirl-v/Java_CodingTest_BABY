class Solution {
    public int solution(String binomial) {
        String[] splitBinomial = binomial.split(" ");
        int answer = 0;
        switch (splitBinomial[1]) {
            case "+" -> answer = Integer.parseInt(splitBinomial[0]) + Integer.parseInt(splitBinomial[2]);
            case "-" -> answer = Integer.parseInt(splitBinomial[0]) - Integer.parseInt(splitBinomial[2]);
            case "*" -> answer = Integer.parseInt(splitBinomial[0]) * Integer.parseInt(splitBinomial[2]);
        }
        return answer;
    }
}