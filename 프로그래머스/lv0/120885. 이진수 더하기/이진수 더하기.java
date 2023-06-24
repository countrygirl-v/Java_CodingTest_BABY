class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int decimal1 = Integer.parseInt(bin1, 2);
        int decimal2 = Integer.parseInt(bin2, 2);
        int sum = decimal1 + decimal2;
        answer = Integer.toBinaryString(sum);

        return answer;
    }
}