class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean zeroCheck = false;

        for (int i : common) {
            if(i == 0) {
                zeroCheck = true;
                break;
            }
        }

        for (int i = 0; i < common.length; i++) {
            if(zeroCheck) break;
            if((common[1] / common[0] == common[2] / common[1]) && (common[1] % common[0] == 0)) {                answer = common[common.length-1] * (common[2] / common[1]);
            }
        }
        for (int i = 0; i < common.length; i++) {
            if(common[1] - common[0] == common[2] - common[1]) {
                answer = common[common.length-1] + (common[2] - common[1]);
            }
        }
        return answer;
    }
}