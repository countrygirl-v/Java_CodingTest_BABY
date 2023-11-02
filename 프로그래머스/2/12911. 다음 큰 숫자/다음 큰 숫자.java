class Solution {
    public int solution(int n) {
        int countOnesN = Integer.bitCount(n);
        while (true) {
            n++;
            int countOnesNext = Integer.bitCount(n);
            if (countOnesN == countOnesNext) {
                return n;
            }
        }
    }
}