class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
            int sum = 0;
            for (int i : num_list) {
                multiply *= i;
                sum += i;
            }
            return multiply < Math.pow(sum, 2) ? 1 : 0;
    }
}