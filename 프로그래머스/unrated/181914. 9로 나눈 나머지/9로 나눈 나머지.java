class Solution {
    public int solution(String number) {
        int total = 0;
        for (String s: number.split("")) {
            total += Integer.parseInt(s);
        }
        return total % 9;
    }
}