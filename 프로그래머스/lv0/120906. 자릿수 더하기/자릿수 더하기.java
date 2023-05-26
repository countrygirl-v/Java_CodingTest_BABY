class Solution {
    public int solution(int n) {
        int five = n / 100000; // 9
        int four = (n - five * 100000) / 10000; // 3
        int three = (n - five * 100000 - four * 10000) / 1000;
        int two = (n - five * 100000 - four * 10000 - three * 1000) / 100;
        int one = (n - five * 100000 - four * 10000 - three * 1000 - two * 100) / 10;
        int zero = n - five * 100000 - four * 10000 - three * 1000 - two * 100 - one * 10;

        int answer = five + four + three + two + one + zero;

        if(n == 1000000) answer = 1;
        
        return answer;
    }
}