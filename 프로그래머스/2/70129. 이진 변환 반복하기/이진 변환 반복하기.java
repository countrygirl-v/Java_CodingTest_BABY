class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        while (!s.equals("1")) {
            zeroCount += s.chars().filter(ch -> ch=='0').count();
            count++;
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
        }
        return new int[] {count, zeroCount};
    }
}